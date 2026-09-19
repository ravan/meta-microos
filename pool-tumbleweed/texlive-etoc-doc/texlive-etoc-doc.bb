SUMMARY = "Documentation for texlive-etoc"
DESCRIPTION = "This package includes the documentation for texlive-etoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn77682"

RPM_NAME = "texlive-etoc-doc-2026.226.1.2dsvn77682-59.2.noarch.rpm"
RPM_HASH = "2111f59763a72389af15a37b6374f42d9115fbbc88910d71b1da1a92e5dae8afcb8e4543cad6004078d7ced3606b6fc8494d71da27fad8b7faec03b7868ab676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
