SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.16.0"

RPM_NAME = "python314-nose2-0.16.0-1.3.noarch.rpm"
RPM_HASH = "74deada1e3872b7687442aedcbee976d616a88d6dc3ae1fc77f4862034a86d23b23699736143013bf4f4a95f508d7d447bf5ea2a40d82f73d66c52974972d50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nose2 \
python314-nose2 \
python3dist-nose2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
