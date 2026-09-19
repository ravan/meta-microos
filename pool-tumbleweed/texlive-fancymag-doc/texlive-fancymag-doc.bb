SUMMARY = "Documentation for texlive-fancymag"
DESCRIPTION = "This package includes the documentation for texlive-fancymag"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75720"

RPM_NAME = "texlive-fancymag-doc-2026.226.1.0svn75720-59.2.noarch.rpm"
RPM_HASH = "478a67c286a48a3346ba5f48e5fd75bf6145924c4bcd983cbcd83836801c38615b38239b4292a9b4f02c6883e59e3dd07d9e326f6a88779e3efecd44d1d5402e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancymag-doc"

RDEPENDS:${PN} += ""

inherit rpm
