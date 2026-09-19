SUMMARY = "Routines and classes supporting MongoDB environments"
DESCRIPTION = "Routines and classes supporting MongoDB environments"
LICENSE = "MIT"

PV = "12.4.0"

RPM_NAME = "python314-jaraco.mongodb-12.4.0-1.4.noarch.rpm"
RPM_HASH = "24f66287b001ea9bd52a71ac23ccc4f04b72a6d361c469e79f02d82a635e31984da35a55535b761f1dcf41028e4b6a2c123d601f14888168f75fdb2ba12da6cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.mongodb \
python314-jaraco.mongodb \
python3dist-jaraco.mongodb"

RDEPENDS:${PN} += "python-abi \
python314-cachetools \
python314-dnspython \
python314-jaraco.collections \
python314-jaraco.context \
python314-jaraco.functools \
python314-jaraco.itertools \
python314-jaraco.logging \
python314-jaraco.services \
python314-jaraco.ui \
python314-more-itertools \
python314-portend \
python314-pymongo \
python314-python-dateutil \
python314-pytimeparse \
python314-tempora"

inherit rpm
