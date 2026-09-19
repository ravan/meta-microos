SUMMARY = "Griffe extension for inheriting docstrings"
DESCRIPTION = "Griffe extension for inheriting docstrings. \
 \
The extension will iterate on every class and their members \
to set docstrings from parent classes when they are not already defined."
LICENSE = "ISC"

PV = "1.1.3"

RPM_NAME = "python314-griffe-inherited-docstrings-1.1.3-1.2.noarch.rpm"
RPM_HASH = "cc059929b5147dc1ab45516fc0c27a04428c6dedc61e996c6f2d1f1a6eebad2f68e5c2180185e1ba5f352b44a245a27ff4a86206eb1870b7d71e08fdff85e7a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-griffe-inherited-docstrings \
python314-griffe-inherited-docstrings \
python3dist-griffe-inherited-docstrings"

RDEPENDS:${PN} += "python-abi \
python314-griffelib"

inherit rpm
