SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "9.0.3"

RPM_NAME = "python313-pytest-9.0.3-1.2.noarch.rpm"
RPM_HASH = "889ca6b823a4d00fcccfa50016aa9f360dbe135ed587c8ec98b13fb9c2cfc75daebdb2544affb2f3dd5a498016f51183f7dcd12104d147e1111340c34fee5b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest \
python3.13dist-pytest \
python313-pytest \
python3dist-pytest"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pygments \
python313-iniconfig \
python313-packaging \
python313-pluggy \
python313-setuptools"

inherit rpm
