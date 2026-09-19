SUMMARY = "Documentation for texlive-threeddice"
DESCRIPTION = "This package includes the documentation for texlive-threeddice"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn20675"

RPM_NAME = "texlive-threeddice-doc-2026.227.1.0svn20675-62.2.noarch.rpm"
RPM_HASH = "9b876db33b8066da8e02960f49bc710e0f5095f4e6a4ab56be310de8db45814f5bac0f09ad918d6569180c04be2670b4125c7c3731bdfeefe0305b1d50b799a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeddice-doc"

RDEPENDS:${PN} += ""

inherit rpm
