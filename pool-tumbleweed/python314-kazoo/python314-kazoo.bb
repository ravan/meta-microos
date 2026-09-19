SUMMARY = "Higher Level Zookeeper Client"
DESCRIPTION = "Implements a higher level API to Apache Zookeeper for Python clients."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "python314-kazoo-2.11.0-1.3.noarch.rpm"
RPM_HASH = "87e1f262e56b134d87e5b8c485e87ea8a7d874141223845d2ba1ed4f45af7f082578ce855f4d9616ab829aa629c881212c1740e68615e01cb470964bbd028323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kazoo \
python314-kazoo \
python3dist-kazoo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
