SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.39"

RPM_NAME = "python313-sqlite-utils-3.39-1.3.noarch.rpm"
RPM_HASH = "41846451063d976ef6f129390ef0c79ec3e6fc19398d7427c80e0412b9d140c8e80b220067d2166a49984546faffe2beaf2afe83d917817c1dad5b71d228e8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite-utils \
python3.13dist-sqlite-utils \
python313-sqlite-utils \
python3dist-sqlite-utils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-click-default-group \
python313-pluggy \
python313-python-dateutil \
python313-sqlite-fts4 \
python313-tabulate \
update-alternatives"

inherit rpm
