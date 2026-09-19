SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-server-4.1.0-1.1.noarch.rpm"
RPM_HASH = "d0ef987d7061882fb0bababd7607dd1a6709124e10244c571bd35af3a4c04756d6ea3d60be3e026cc576b52ad52ace785b428db5362f85f835c5782f62e1b52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-moto-server"

RDEPENDS:${PN} += "python39-Flask \
python39-Flask-Cors \
python39-moto-all"

inherit rpm
