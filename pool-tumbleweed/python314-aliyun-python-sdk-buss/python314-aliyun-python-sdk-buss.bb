SUMMARY = "The buss module of Aliyun Python SDK"
DESCRIPTION = "The buss module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python314-aliyun-python-sdk-buss-1.0.0-1.8.noarch.rpm"
RPM_HASH = "0c040eb90ac74b2c2d7f411570b2a2dc549318b50c230c48f747ce611b597639fde53a82ecfe34da341959fbad8493055861000f8d0634c6f42380d7b3d42eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aliyun-python-sdk-buss \
python314-aliyun-python-sdk-buss \
python3dist-aliyun-python-sdk-buss"

RDEPENDS:${PN} += "python-abi \
python314-aliyun-python-sdk-core"

inherit rpm
