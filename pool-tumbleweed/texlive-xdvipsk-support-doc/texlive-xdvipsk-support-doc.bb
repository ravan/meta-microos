SUMMARY = "Documentation for texlive-xdvipsk-support"
DESCRIPTION = "This package includes the documentation for texlive-xdvipsk-support"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77772"

RPM_NAME = "texlive-xdvipsk-support-doc-2026.226.1.0svn77772-59.4.noarch.rpm"
RPM_HASH = "4a9d48403cb17fb1c6ac4acb8039ccc5819da7f3da32d80b473900dc3099daf0bb88305432a51a7a77f35e8b8644270afd654a25f76708959636e18db749ebf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xdvipsk-support-doc"

RDEPENDS:${PN} += ""

inherit rpm
