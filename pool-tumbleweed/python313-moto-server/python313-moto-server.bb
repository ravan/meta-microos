SUMMARY = "Library to mock out the boto library -- moto[server]"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extra (moto[server])"
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python313-moto-server-5.2.1-1.2.noarch.rpm"
RPM_HASH = "379afd62c4f6e0ac628f6ac330140091733f974890321201518e6ee0a52ca97135cda08f42866d13f883b1ce0290a893181b972288b3c6b619de1a83c854851e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-server \
python313-moto-server"

RDEPENDS:${PN} += "python313-Flask \
python313-Flask-Cors \
python313-moto-all"

inherit rpm
