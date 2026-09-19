SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python38-moto-server-4.1.0-1.1.noarch.rpm"
RPM_HASH = "fb37b23a5fdbd131083db24eb803a7de243e974105cbb928978e2e2b621e40135ad0512866238c62e0bb59b7109946617c770da33ef4bb6b535cbf4376595e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python38-moto-server"

RDEPENDS:${PN} += "python38-Flask \
python38-Flask-Cors \
python38-moto-all"

inherit rpm
