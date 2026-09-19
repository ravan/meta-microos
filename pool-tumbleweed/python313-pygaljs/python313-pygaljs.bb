SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python313-pygaljs-1.0.2-3.5.noarch.rpm"
RPM_HASH = "67c158de9cfc015ebd84fe05e30764ebb3f60adfca1b6b7968780b39106efe573bd9235118b5023ce65155de928090b22c57da50428f9249daba0bcc4dc71ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygaljs \
python3.13dist-pygaljs \
python313-pygaljs \
python3dist-pygaljs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
