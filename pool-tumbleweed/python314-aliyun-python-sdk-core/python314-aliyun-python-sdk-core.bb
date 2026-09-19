SUMMARY = "The core module of Aliyun Python SDK"
DESCRIPTION = "The core module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "2.16.0"

RPM_NAME = "python314-aliyun-python-sdk-core-2.16.0-1.9.noarch.rpm"
RPM_HASH = "97fd5a159ee613c85466f092da47bb1648b963a3e70743515716b642ca384ba96b13705cfc373ecb16c3b1eb928e8ddd66f4832a104f125c665826eadc37ff31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aliyun-python-sdk-core \
python314-aliyun-python-sdk-core \
python3dist-aliyun-python-sdk-core"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-jmespath \
python314-requests \
python314-six"

inherit rpm
