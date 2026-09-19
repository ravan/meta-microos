SUMMARY = "Routines and classes supporting MongoDB environments"
DESCRIPTION = "Routines and classes supporting MongoDB environments"
LICENSE = "MIT"

PV = "12.4.0"

RPM_NAME = "python313-jaraco.mongodb-12.4.0-1.4.noarch.rpm"
RPM_HASH = "d8236817b55c67a92fdc758e30cbaf41a61b10a8c9b507b7ad53d32478a08416b83eacb5ceeffb69a7ca87f951e2bcfd5674a3dfc3c5427a190906c0dba68681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.mongodb \
python3.13dist-jaraco.mongodb \
python313-jaraco.mongodb \
python3dist-jaraco.mongodb"

RDEPENDS:${PN} += "python-abi \
python313-cachetools \
python313-dnspython \
python313-jaraco.collections \
python313-jaraco.context \
python313-jaraco.functools \
python313-jaraco.itertools \
python313-jaraco.logging \
python313-jaraco.services \
python313-jaraco.ui \
python313-more-itertools \
python313-portend \
python313-pymongo \
python313-python-dateutil \
python313-pytimeparse \
python313-tempora"

inherit rpm
