package com.tanggoooo.exception;

/**
 * Created by panxing on 17/7/25
 */
public enum IdtWebError {

    // common
    COMMON("接口调用出错", 3000),
    NO_LOGIN("no_login", 3001),
    ADMIN_ONLY("只有管理员账号可以调用这个接口", 3002),
    WRONG_ACCOUNT_OR_PSW("账号或密码错误", 3003),
    COMMON_SQL_ERROR("mysql通用错误", 3004),
    COMMON_IO_ERROR("io通用错误", 3005),
    INVALID_PASSWORD("密码格式错误", 3006),
    INVALID_EMAIL("邮箱格式错误", 3007),
    INVALID_NAME("账号格式错误", 3008),
    DELETE_FAIL("删除失败", 3009),
    UPDATE_FAIL("修改失败", 3010),
    COMMON_UPLOAD_FILE_TYPE_ERROR("上传文件格式错误", 3011),
    COMMON_UPLOAD_FILE_UPLOADING("uploading", 3012),
    COMMON_PARAMS_ERR("提交参数不合法", 3013),
    COMMON_FILE_NOT_EXIST("文件没找到，请联系管理员", 3014),
    COMMON_INVALID_TASK_NAME("任务名为空或者已存在", 3015),
    COMMON_INVALID_ACCOUNT_ID("账号id不合法", 3016),
    COMMON_COMPRESSED_FILE_UNZIP_ERROR("解压出错,请检查压缩文件完整性", 3017),
    COMMON_COMPRESSED_FILE_NOT_EXIST("压缩文件不存在", 3018),
    COMMON_COMPRESSED_FILE_FORMAT_ERROR("文件格式不对", 3019),
    COMMON_UPLOAD_FILE_FAIL("上传文件失败", 3020),
    COMMON_USER_NOT_EXIST("不存在的user", 3021),
    COMMON_TOO_MANY_REQUEST("短时间请求数过多", 3022),
    COMMON_DATA_NOT_EXIST("无法找到数据", 3023),
    COMMON_WRONG_TOKEN("token错误", 3024),
    COMMON_PARAM_EMPTY("所有参数不能为空", 3025),
    COMMON_CODE_NOT_EXIST("这个功能还没开发。。尴尬", 3026),
    COMMON_WRONG_PAGE_OR_NUM("page和num均要大于0", 3027),
    COMMON_TIME_NOT_EXIST("必须选择时间", 3028),
    ACCOUNT_DISABLE("账号已失效", 3029),
    COMMON_FEIGN_UNKNOW_ERROR("服务间接口调用异常，请稍后重试", 3030),
    WRONG_PSW("原密码错误", 3031),


    // banana
    BANANA_EMPTY_CONDITION_RESULT("没有找到符合条件的数据", 4001),
    BANANA_CONDITION_PARSE_ERROR("解析condition报错", 4002),
    BANANA_NAME_EXIST("该名称已存在", 4003),
    BANANA_FILE_DATA_NULL("文档中不不存在有效的数据", 4004),
    BANANA_FILE_DATA_ERR("文档中的数据格式错误", 4005),
    BANANA_FILE_NOT_EXIST("文件不存在", 4006),
    BANANA_FILE_TITLE_ERR("标题基础数据项不足，请查看相应导入模板", 4007),
    BANANA_NOTHING_TO_AGG("需要聚合的层级筛选条件不能为空!", 4008),


    BANANA_SHELF_OWNER_NOT_EXIST("本品还没设置", 4100),
    BANANA_CAN_NOT_ADD_OWNER("只能增加ower", 4101),
    BANANA_DUPLICATE_EMAIL("邮箱不能重复", 4102),

    //banana manager
    BANANA_CONFIG_NULL_STORE_FINE("没有找到符合条件的店铺", 5001),
    BANANA_FILE_TXT_PARAM_ERR("标题存在无效的数据项", 5002),
    BANANA_OBJECT_GET_ERR("对象数据请求失败", 5003),
    BANANA_CONFIG_COPY_PROJECT_ALREADY("该公司项目已存在复制的公司项目", 5101),
    BANANA_ALL_SKU_INVALID("所有SKU都已经失效了", 5102),

    //banana label
    BANANA_LEVEL_INSPECTOR_ONLY("只有质检员才能调用这个接口", 5004),
    BANANA_LEVEL_MANAGER_ONLY("只有管理员才能调用这个接口", 5005),
    BANANA_LEVEL_MARKER_ONLY("只有标注员才能调用这个接口", 5006),
    BANANA_MARKER_STATE_STOP("该标注员已经被管理员冻结", 5007),
    BANANA_MARKER_NO_PROJECT_ASSIGNED("该标注员没有被分配任何项目", 5008),
    BANANA_PROJECT_INFO_UPDATE_ERRROR("修改projectInfo出错", 5009),
    BANANA_MARKER_LABEL_TOO_LATE("图片已经开始拼接，标注修改不会影响结果", 5010),
    BANANA_MARKER_OFF_WORK("今天下班前上传的图片已经标注完毕，请下班！", 5011),
    BANANA_LEVEL_PUZZLER_ONLY("只有拼接员才能调用这个接口", 5012),
    BANANA_PUZZLER_STATE_STOP("该拼接员已经被管理员冻结", 5013),
    BANANA_PUZZLER_NO_PROJECT_ASSIGNED("该拼接员员没有被分配任何项目", 5014),
    BANANA_PUZZLER_ALREAD_DISTRIBUTION("已存在项目被分配给审核员,是否确认修改项目", 5015),
    BANANA_LABEL_SET_DATE_TIMEOUT("处理超时，该图片已被分配给另一人", 5016),
    BANANA_LABEL_TRAIN_NO_DATA("该列表项目无素材，请先增加素材", 5017),
    BANANA_LABEL_IMAGE_DELETE("已在app端被删除，无需审核该照片", 5018),


    //pineapple
    PINEAPPLE_COMPRESSED_FILE_EMPTY_IMAGE("压缩文件不存在有效图片, 请检查", 6001),
    PINEAPPLE_COMPRESSED_FILE_EMPTY_TASK_DIR("压缩文件不存在任务目录,请检查", 6002),
    PINEAPPLE_UPLOAD_FILE_NOT_EXIST("上传文件记录不存在", 6003),
    PINEAPPLE_UPLOAD_FILE_ADD_ERROR("添加上传文件记录出错", 6004),
    PINEAPPLE_UPLOAD_FILE_TYPE_ERROR("上传文件type参数错误", 6005),
    PINEAPPLE_UPLOAD_FILE_GET_ALL_ERROR("上传文件获取列表出错", 6006),
    PINEAPPLE_IMAGE_NOT_EXIST("图片不存在", 6007),
    PINEAPPLE_COMPRESSED_FILE_EMPTY_VALID_TASK("压缩文件不存在有效任务", 6008),

    //coconut
    COCONUT_EMPTY_CONDITION_RESULT("没有找到符合条件的数据", 8001),
    COCONUT_NAME_EXIST("该名称已存在", 8003),
    COCONUT_FILE_NOT_EXIST("文件不存在", 8006),
    COCONUT_FILE_TITLE_ERR("标题基础数据项不足，请查看相应导入模板", 8007),
    COCONUT_PRODUCT_ACCEPTED("全部正确", 8008),
    COCONUT_PRODUCT_ERROR_FORMAT("格式错误", 8009),
    COCONUT_PRODUCT_ERROR_REPEAT("疑似重复", 8010),

    // peach
    PEACH_TOO_MANY_ROWS("立白货架最多5排！", 7001),
    PEACH_WRONG_ROW_NUM("立白货架必须是5排！", 7002),

    // es
    TOO_BIG_PAGE_SEARCH("单页查询数据不能超过10000!", 9000),
    TOO_BIG_PAGE_EXPORT("导出数据不能超过50000条!", 9001);


    public final String errMsg;
    public final int code;

    IdtWebError(String errMsg, int code) {
        this.errMsg = errMsg;
        this.code = code;
    }
}
