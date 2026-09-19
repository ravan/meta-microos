SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-happybase-1.3.0-1.2.noarch.rpm"
RPM_HASH = "1014e42e76484dceca3fe7176fc8a38e208678749b8c25006ce09475ce2150e3fe3a9314ebebfacec8a754819e65f32b80fb3883b362a5a4f13380fa47e41b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-happybase \
python3.13dist-happybase \
python313-happybase \
python3dist-happybase"

RDEPENDS:${PN} += "python-abi \
python313-importlib-resources \
python313-six \
python313-thriftpy2"

inherit rpm
