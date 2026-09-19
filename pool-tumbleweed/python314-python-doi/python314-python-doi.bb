SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python314-python-doi-0.2.0-1.16.noarch.rpm"
RPM_HASH = "89ff21535bc093a1054aa7a6ffeb50571a713f47e152b8f2a15b837b8833ebcf133d3b26eb0d4fff64535fb0df7bc706a6ccea9599d5c451537738d6ee44e427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-doi \
python314-python-doi \
python3dist-python-doi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
