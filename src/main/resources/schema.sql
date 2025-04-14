-- 侵权案例表
CREATE TABLE tort_case (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    case_type VARCHAR(100),
    data_volume INTEGER,
    time_range INTEGER,
    compensation_range VARCHAR(100),
    accuracy DOUBLE,
    impact_factor DOUBLE,
    analysis_result VARCHAR(500),
    weighting_factors VARCHAR(200),
    create_time TIMESTAMP
);

-- 法规解读表
CREATE TABLE legal_regulation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    regulation_id VARCHAR(50),
    title VARCHAR(200),
    category VARCHAR(100),
    publish_date TIMESTAMP,
    source VARCHAR(100),
    applicable_scope VARCHAR(200),
    compensation_standard VARCHAR(100),
    update_time TIMESTAMP,
    status VARCHAR(50)
);

-- 预测记录表
CREATE TABLE prediction_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    prediction_id VARCHAR(50),
    case_type VARCHAR(100),
    predicted_amount DOUBLE,
    actual_amount DOUBLE,
    accuracy DOUBLE,
    prediction_date TIMESTAMP,
    model_version VARCHAR(50),
    status VARCHAR(50),
    remark VARCHAR(500)
);


-- 创建用户表
CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(20),
    status VARCHAR(20),
    last_login_time VARCHAR(50)
);