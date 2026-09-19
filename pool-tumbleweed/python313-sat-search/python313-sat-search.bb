SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-sat-search-0.3.0-3.8.noarch.rpm"
RPM_HASH = "632d43dc7364e556b105184e3244f7d424cbe0fd4c3dac7c1422f964e0042108a0aca85194ce7351f7138e38c86fe39f8d1fca2b4bd5b7ac7b33cbae71f9f1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sat-search \
python3.13dist-sat-search \
python313-sat-search \
python3dist-sat-search"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-sat-stac \
update-alternatives"

inherit rpm
