SUMMARY = "Documentation for texlive-lxfonts"
DESCRIPTION = "This package includes the documentation for texlive-lxfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-lxfonts-doc-2026.226.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "26d9d38fca0889c04d8a46af4761a00d953b47b2c2824a8fe307980013e9ecdc5687e394c2b6a155450ca72954322f915f3c2cf31332ef5973b6d691f8df1bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lxfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
