-- 插入测试用户数据
INSERT INTO users (username, password, role, status) VALUES 
('admin', 'jiajia', 'ADMIN', 'ACTIVE'),
('user1', 'jiajia', 'USER', 'ACTIVE');

-- 插入侵权案例测试数据
INSERT INTO tort_case (case_type, data_volume, time_range, compensation_range, accuracy, impact_factor, analysis_result, create_time) VALUES 
('数据泄露', 1000, 30, '10000-50000', 0.85, 0.75, '建议赔偿金额在30000元左右', CURRENT_TIMESTAMP()),
('未授权使用', 500, 15, '5000-20000', 0.92, 0.65, '建议赔偿金额在15000元左右', CURRENT_TIMESTAMP());

-- 插入法规解读测试数据
INSERT INTO legal_regulation (regulation_id, title, category, publish_date, source, applicable_scope, status) VALUES 
('REG001', '个人信息保护法', '数据保护', CURRENT_TIMESTAMP(), '全国人大', '个人信息处理者', 'ACTIVE'),
('REG002', '数据安全法', '数据安全', CURRENT_TIMESTAMP(), '全国人大', '数据处理活动', 'ACTIVE');

-- 插入预测记录测试数据
INSERT INTO prediction_record (prediction_id, case_type, predicted_amount, actual_amount, accuracy, prediction_date, model_version, status) VALUES 
('PRED001', '数据泄露', 30000.00, 32000.00, 0.94, CURRENT_TIMESTAMP(), 'v1.0', '已确认'),
('PRED002', '未授权使用', 15000.00, 14500.00, 0.97, CURRENT_TIMESTAMP(), 'v1.0', '已确认');