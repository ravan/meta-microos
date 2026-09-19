SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python314-pypi-search-1.2.1-3.5.noarch.rpm"
RPM_HASH = "c324873adb3fdc4592afd607b6f8b0e51f907020ee1aae381a2566b69ee3e69d7a920c4c7654f3e2751256e07c02e679f2e6cbcc66296c7405acaf62f035c482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypi-search \
python314-pypi-search \
python3dist-pypi-search"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-beautifulsoup4 \
python314-html2text \
python314-requests"

inherit rpm
