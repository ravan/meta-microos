SUMMARY = "Documentation for python-beautifulsoup4"
DESCRIPTION = "Documentation and help files for python-beautifulsoup4"
LICENSE = "MIT"

PV = "4.15.0"

RPM_NAME = "python-beautifulsoup4-doc-4.15.0-1.3.noarch.rpm"
RPM_HASH = "6e63bd89d5ff14b2f4347d87bf948b99fb03b5c656af34c5b3034b278a380835b2cb9cb32abb823cf3544d2c8f95dd0570232f0e2e0f3897efe4ebeb364f1fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-beautifulsoup4-doc \
python3-beautifulsoup4-doc \
python313-beautifulsoup4-doc \
python314-beautifulsoup4-doc"

RDEPENDS:${PN} += ""

inherit rpm
