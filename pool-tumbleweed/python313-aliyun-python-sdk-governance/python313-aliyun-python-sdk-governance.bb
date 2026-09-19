SUMMARY = "The governance module of Aliyun Python SDK"
DESCRIPTION = "The governance module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python313-aliyun-python-sdk-governance-1.0.0-1.8.noarch.rpm"
RPM_HASH = "55881ce0e75f4af91b527e3d8ca4982b39a10a10e83c2964bb9534850faf25131052eae3ec1a576a0ce0f4a9d3f70d6f4ab7f8fa1f368fcfa056cc7d778a84d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aliyun-python-sdk-governance \
python3.13dist-aliyun-python-sdk-governance \
python313-aliyun-python-sdk-governance \
python3dist-aliyun-python-sdk-governance"

RDEPENDS:${PN} += "python-abi \
python313-aliyun-python-sdk-core"

inherit rpm
