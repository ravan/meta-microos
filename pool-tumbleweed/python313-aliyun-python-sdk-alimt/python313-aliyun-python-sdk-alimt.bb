SUMMARY = "The alimt module of Aliyun Python SDK"
DESCRIPTION = "The alimt module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python313-aliyun-python-sdk-alimt-3.2.0-2.9.noarch.rpm"
RPM_HASH = "20ff544484103fcfb3de6f608df103d606c77302a10be9e7bb4306f89500bec1207bf8c9e851d9909f0c36e3ab42fac9ffa3fe5be1f225b042a3311585f2ac80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aliyun-python-sdk-alimt \
python3.13dist-aliyun-python-sdk-alimt \
python313-aliyun-python-sdk-alimt \
python3dist-aliyun-python-sdk-alimt"

RDEPENDS:${PN} += "python-abi \
python313-aliyun-python-sdk-core"

inherit rpm
