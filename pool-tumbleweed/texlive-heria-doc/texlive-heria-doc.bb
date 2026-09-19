SUMMARY = "Documentation for texlive-heria"
DESCRIPTION = "This package includes the documentation for texlive-heria"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.1.0svn76077"

RPM_NAME = "texlive-heria-doc-2026.226.4.0.1.0svn76077-60.4.noarch.rpm"
RPM_HASH = "93cbdd63befba6b0c7c59a4539f6248dd8866fb95a12858458dcd580c5f35914a491a66c5b485efc1407461cee20c70c6afac0123486b2ac6b0713b24242e76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heria-doc"

RDEPENDS:${PN} += ""

inherit rpm
