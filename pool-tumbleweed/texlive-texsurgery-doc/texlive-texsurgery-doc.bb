SUMMARY = "Documentation for texlive-texsurgery"
DESCRIPTION = "This package includes the documentation for texlive-texsurgery"
LICENSE = "BSD-3-Clause"

PV = "2026.227.0.0.6.0svn59885"

RPM_NAME = "texlive-texsurgery-doc-2026.227.0.0.6.0svn59885-62.2.noarch.rpm"
RPM_HASH = "40ac2e46f9b6201b6eedf4aad2e9d35a907d0a0940639c5cc4844e6be5d7aa1ccbd917b85d953b3bd7a64c47757f53fba5687389fdd70666028d42a7463dacbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texsurgery-doc"

RDEPENDS:${PN} += ""

inherit rpm
