SUMMARY = "The alimt module of Aliyun Python SDK"
DESCRIPTION = "The alimt module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python314-aliyun-python-sdk-alimt-3.2.0-2.9.noarch.rpm"
RPM_HASH = "54509d5c832eeb1c46058903a07136f13c007abf45b1dd68beb6d0ddd78c02783b5ea4289ce4cbed88886e2b9704384a0f944544a566f20400b6c0ca9a7a4e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aliyun-python-sdk-alimt \
python314-aliyun-python-sdk-alimt \
python3dist-aliyun-python-sdk-alimt"

RDEPENDS:${PN} += "python-abi \
python314-aliyun-python-sdk-core"

inherit rpm
