SUMMARY = "Documentation for texlive-xellipsis"
DESCRIPTION = "This package includes the documentation for texlive-xellipsis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn47546"

RPM_NAME = "texlive-xellipsis-doc-2026.226.2.0svn47546-59.4.noarch.rpm"
RPM_HASH = "42fb503a5fb6986258f86e106ab4a495d285438968417e41fe1db0a245a28370bb224e9127c939a3932a52fc88957b28547736428dc6de357c1b6c198a15fc55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
