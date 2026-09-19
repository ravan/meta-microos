SUMMARY = "Documentation for texlive-kotex-plain"
DESCRIPTION = "This package includes the documentation for texlive-kotex-plain"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn63689"

RPM_NAME = "texlive-kotex-plain-doc-2026.226.3.0.0svn63689-63.2.noarch.rpm"
RPM_HASH = "f32e02e552dcf9a460e613ded1c8f13f8ffcf22e3e9e6c97210706c31b05a87dd71d8ad543f96be6751f5f8cc3a2773a2659f686f718ad849f51258f45390beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-plain-doc"

RDEPENDS:${PN} += ""

inherit rpm
