SUMMARY = "Documentation for texlive-datetime2-danish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-danish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47034"

RPM_NAME = "texlive-datetime2-danish-doc-2026.226.1.1svn47034-59.2.noarch.rpm"
RPM_HASH = "5bdc607754bc2dd357b853a21fef5f0449b3a23b01b172c769f4f4ed93fce24c08e3d805d133aa9b17a48d14f6dc123d31c8644e9dde83fe228a8b1ef293815a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
