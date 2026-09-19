SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-server-4.1.0-1.1.noarch.rpm"
RPM_HASH = "c7a964189b62a4591474561610223251f24b93f8c30ea4bd2d6de6bb7c9138598e56b4e1b1b6e3ae70feb481e80f96b6649595d9dbc46de83a8793c70e87ec0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-server \
python310-moto-server"

RDEPENDS:${PN} += "python310-Flask \
python310-Flask-Cors \
python310-moto-all"

inherit rpm
