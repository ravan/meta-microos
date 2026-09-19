SUMMARY = "Documentation for texlive-robotarm"
DESCRIPTION = "This package includes the documentation for texlive-robotarm"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-doc-2026.226.0.0.1svn63116-60.4.noarch.rpm"
RPM_HASH = "9272388707fb260e6e05361e3490080cbe0e4ad1ff43a8e212bf5df42b07c1b050bf2b35b41922c35ad4b1f7b11d488c1e188172f015acbe9e065e6b1f152c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robotarm-doc"

RDEPENDS:${PN} += ""

inherit rpm
