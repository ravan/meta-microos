SUMMARY = "Documentation for texlive-gitinfo"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn34049"

RPM_NAME = "texlive-gitinfo-doc-2026.226.1.0svn34049-60.4.noarch.rpm"
RPM_HASH = "75a15e44b2bf6fc441fdbdd4128778f6b1653f1d7d66afc6b52cd65f77692de343844e6116f558b10ad6e003baf433d0541c7f5359c7dab2a2e41b4581d396bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
