SUMMARY = "Documentation for texlive-purifyeps"
DESCRIPTION = "This package includes the documentation for texlive-purifyeps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn29725"

RPM_NAME = "texlive-purifyeps-doc-2026.226.1.1svn29725-60.4.noarch.rpm"
RPM_HASH = "5a233046bdbbf4309b8a81b622e05bea1e08039c82e926de421894d0a8c54cbf3f7d6b125bba5963511c2696d401e7214ff627a102402fdc1331fa62966c549d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-purifyeps.1 \
texlive-purifyeps-doc"

RDEPENDS:${PN} += ""

inherit rpm
