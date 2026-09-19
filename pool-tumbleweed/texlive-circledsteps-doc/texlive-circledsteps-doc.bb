SUMMARY = "Documentation for texlive-circledsteps"
DESCRIPTION = "This package includes the documentation for texlive-circledsteps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.3svn77682"

RPM_NAME = "texlive-circledsteps-doc-2026.226.1.3.3svn77682-60.2.noarch.rpm"
RPM_HASH = "d4a09f04f8662a5635e5f8f58512f2dff1bd4625cf79494cb5cd564a79469a965852936dda2fd2d371c44d66cdd17c746f6db9d09960357c7441507a85309627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circledsteps-doc"

RDEPENDS:${PN} += ""

inherit rpm
