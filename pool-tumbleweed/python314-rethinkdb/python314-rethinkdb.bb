SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.10.post1"

RPM_NAME = "python314-rethinkdb-2.4.10.post1-1.12.noarch.rpm"
RPM_HASH = "e0dafd1ca034487e8e246259c8d4eff99e62d362a1704febabc9c8448bff42e8c4fa90b1a085f50f06a2df8930f49d6a27092b44908c14f9058506afd83cab3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rethinkdb \
python314-rethinkdb \
python3dist-rethinkdb"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-looseversion \
python314-six \
update-alternatives"

inherit rpm
