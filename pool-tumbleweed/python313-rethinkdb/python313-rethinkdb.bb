SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.10.post1"

RPM_NAME = "python313-rethinkdb-2.4.10.post1-1.12.noarch.rpm"
RPM_HASH = "66443c13ccbd21079c0188d74ff714b2e40b4d3679c99a6b8b140e86f9b1347595db50451bccddddfe38dd5536e8f3a0990feb67caccbf2c6a62bc88de90519f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rethinkdb \
python3.13dist-rethinkdb \
python313-rethinkdb \
python3dist-rethinkdb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-looseversion \
python313-six \
update-alternatives"

inherit rpm
