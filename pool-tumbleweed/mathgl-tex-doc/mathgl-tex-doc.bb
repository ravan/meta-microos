SUMMARY = "Documentation for mglTeX"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides documentation for mglTeX."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-tex-doc-8.0.3-2.6.noarch.rpm"
RPM_HASH = "c53596289993114dc90e1451a6beadcae3907e1d57c04d129a66d4deb546ce9db441be2bb06f96b93cf0e7ff20e3f6566f3558149c99d3590de1a5fca78947d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm
