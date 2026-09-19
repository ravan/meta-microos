SUMMARY = "Documentation for texlive-pst-fit"
DESCRIPTION = "This package includes the documentation for texlive-pst-fit"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn70686"

RPM_NAME = "texlive-pst-fit-doc-2026.226.0.0.03svn70686-59.2.noarch.rpm"
RPM_HASH = "d09f34af58494e90de359370fde5e68d7a72d5b646e7ce2750bfa645912093e35c1b72a2d2ad13652da6729027d09b060df9677e2f4b98d6e031ad9967915cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fit-doc"

RDEPENDS:${PN} += ""

inherit rpm
