SUMMARY = "Documentation for texlive-endfloat"
DESCRIPTION = "This package includes the documentation for texlive-endfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-endfloat-doc-2026.226.2.7svn77682-61.4.noarch.rpm"
RPM_HASH = "d0e9976898271dfdaa47d0ded52fe884290c3bb8d73742875a0f9200b62547587c6f516f51858aa19210d974a02cae8119767d5ff709c474ac906ad6686f4a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
