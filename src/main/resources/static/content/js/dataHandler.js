class DataHandler {
    constructor(initialData = []) {
        this.data = initialData;
        this.currentPage = 1;
        this.pageSize = 10;
    }

    getPageData() {
        const start = (this.currentPage - 1) * this.pageSize;
        const end = start + this.pageSize;
        return {
            total: this.data.length,
            data: this.data.slice(start, end),
            currentPage: this.currentPage,
            totalPages: Math.ceil(this.data.length / this.pageSize)
        };
    }

    add(item) {
        this.data.unshift({...item, id: Date.now()});
        return true;
    }

    update(id, newData) {
        const index = this.data.findIndex(item => item.id === id);
        if (index !== -1) {
            this.data[index] = {...this.data[index], ...newData};
            return true;
        }
        return false;
    }

    delete(id) {
        const index = this.data.findIndex(item => item.id === id);
        if (index !== -1) {
            this.data.splice(index, 1);
            return true;
        }
        return false;
    }

    setPage(page) {
        this.currentPage = page;
    }

    setPageSize(size) {
        this.pageSize = size;
        this.currentPage = 1;
    }
}