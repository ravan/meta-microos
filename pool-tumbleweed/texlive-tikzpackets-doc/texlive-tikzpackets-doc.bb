SUMMARY = "Documentation for texlive-tikzpackets"
DESCRIPTION = "This package includes the documentation for texlive-tikzpackets"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55827"

RPM_NAME = "texlive-tikzpackets-doc-2026.226.1.0svn55827-59.2.noarch.rpm"
RPM_HASH = "4c103817f577cf73b4b2b14a3428501882f409fc053453e21760178a4e667848a22a8e3090f808a2b40ee266aa5b0f56b07752e6c073131015e33762a0b4a6fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
