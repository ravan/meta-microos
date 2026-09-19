SUMMARY = "Documentation for texlive-hitex"
DESCRIPTION = "This package includes the documentation for texlive-hitex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-hitex-doc-2026.226.svn77830-60.4.noarch.rpm"
RPM_HASH = "b631369e72cae640bfa4f262d817e72b9f890b078c355123b23169144347295daff8aa22064fd0f77e321dcb4db809ed8ad6c587e068c9ae5b576658d400d0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hishrink.1 \
man-histretch.1 \
man-hitex.1 \
man-texprof.1 \
man-texprofile.1 \
texlive-hitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
