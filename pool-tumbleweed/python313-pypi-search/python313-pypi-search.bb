SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python313-pypi-search-1.2.1-3.5.noarch.rpm"
RPM_HASH = "a4f118da60b433192f06297103acc1aa9785d0160e950000e908b2103a804e18b492e890d56a0df9530b5aa41cda54713dc28fded1f74f4e63204877949ef6ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypi-search \
python3.13dist-pypi-search \
python313-pypi-search \
python3dist-pypi-search"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-beautifulsoup4 \
python313-html2text \
python313-requests"

inherit rpm
