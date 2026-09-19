SUMMARY = "The core module of Aliyun Python SDK"
DESCRIPTION = "The core module of Aliyun Python SDK."
LICENSE = "Apache-2.0"

PV = "2.16.0"

RPM_NAME = "python313-aliyun-python-sdk-core-2.16.0-1.9.noarch.rpm"
RPM_HASH = "f34d497913176d765fac9c1c760e746bcabc1373943af17114869347575c285b19afc23cce7358b680b7e01329ea211c5f1105b365a68f378b2406510194765b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aliyun-python-sdk-core \
python3.13dist-aliyun-python-sdk-core \
python313-aliyun-python-sdk-core \
python3dist-aliyun-python-sdk-core"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-jmespath \
python313-requests \
python313-six"

inherit rpm
