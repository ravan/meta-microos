SUMMARY = "Library to mock out the boto library -- moto[server]"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extra (moto[server])"
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python314-moto-server-5.2.1-1.2.noarch.rpm"
RPM_HASH = "dece70563c6b9ca21dda0232a8e31c08fa3487302e9fa9f36f66652c932163d47ae65708b5cd7133c0d20339e6ae6aac984a87e269c56e1ccffcac32572e528f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-moto-server"

RDEPENDS:${PN} += "python314-Flask \
python314-Flask-Cors \
python314-moto-all"

inherit rpm
