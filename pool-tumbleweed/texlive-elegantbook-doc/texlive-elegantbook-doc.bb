SUMMARY = "Documentation for texlive-elegantbook"
DESCRIPTION = "This package includes the documentation for texlive-elegantbook"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6svn78191"

RPM_NAME = "texlive-elegantbook-doc-2026.226.4.6svn78191-61.4.noarch.rpm"
RPM_HASH = "66aa695fe05e41e4faf3277d62662731d7f79a9af83351dc33b280c449222f8cab07bdc7ca74361afe1224191710a263380f4d54453480fed181545401fbab3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elegantbook-doc-zh \
texlive-elegantbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
