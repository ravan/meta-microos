SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-pluggy-1.6.0-2.7.noarch.rpm"
RPM_HASH = "1fd83d8adf16bad466d9dbbaf8c3fecacff30352e24c07d3da1f70ee92391b2224872b1a3010a4b03ba35689d033dab5d09a60f423f7acf7e3252b0300b9f8f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pluggy \
python314-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
