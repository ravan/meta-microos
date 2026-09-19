SUMMARY = "Static library for libeconf"
DESCRIPTION = "This package contains libeconf.a static library."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "libeconf-devel-static-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "6ee84b2363761b2643b78b6a22bd94bd484e68b39f9081106e4b93bfb508815110148a4045598dfd134405c53e0aa886a76cf99d5579557a3f9d19ee63cc3780"

RPROVIDES:${PN} += "libeconf-devel-static"

RDEPENDS:${PN} += "libeconf-devel"

inherit rpm
