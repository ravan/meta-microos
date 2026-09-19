SUMMARY = "Documentation for the InChI library"
DESCRIPTION = "This package contains the user documentation for the InChI software \
and InChI library API reference for developers."
LICENSE = "MIT"

PV = "1.07.5"

RPM_NAME = "inchi-doc-1.07.5-1.4.noarch.rpm"
RPM_HASH = "41f1e2dff483f60435063a5bba8a85811275057fe4c6b1ad2473e5afec080f3f9aaf85e242ff5e99a1270d7ffaa2eef7393e3b65c199e31d1daf2d4d9c16e239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inchi-doc"

RDEPENDS:${PN} += ""

inherit rpm
