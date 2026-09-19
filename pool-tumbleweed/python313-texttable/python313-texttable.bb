SUMMARY = "Module for creating simple ASCII tables"
DESCRIPTION = "texttable is a module to generate a formatted text table, using ASCII \
characters."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python313-texttable-1.7.0-1.12.noarch.rpm"
RPM_HASH = "f7947dd1a63c73d69b99d5733490d1033d4edf9945e821572d1f22029f1ba67c93a685a0d69e4754e029f0f98f025f22790a0eda5183a6c09bd892cb1e0f521c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-texttable \
python3.13dist-texttable \
python313-texttable \
python3dist-texttable"

RDEPENDS:${PN} += "python-abi \
python313-base"

inherit rpm
