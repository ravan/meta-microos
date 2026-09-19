SUMMARY = "Documentation for texlive-wtref"
DESCRIPTION = "This package includes the documentation for texlive-wtref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn69214"

RPM_NAME = "texlive-wtref-doc-2026.226.1.0.0svn69214-59.4.noarch.rpm"
RPM_HASH = "21f1a96ff69f59521a779e7601f088d8527bc13aca4b8221efd458f91485aed9047209a8ea639c244302a6c9913f10bd8d592d24bcb01ede80ee6ed213c95a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wtref-doc-ja \
texlive-wtref-doc"

RDEPENDS:${PN} += ""

inherit rpm
