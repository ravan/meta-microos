SUMMARY = "Documentation for texlive-playfair"
DESCRIPTION = "This package includes the documentation for texlive-playfair"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-playfair-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "dd9839a6799282ceefb1c0d2f4c3e0d1a0735a07fcc4f6c6448128a93448e8ad2b009ab5d77b495957b174dd7893e6ade2f352f1701c9a5091915b7ab26cb71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-playfair-doc"

RDEPENDS:${PN} += ""

inherit rpm
