SUMMARY = "Documentation for texlive-ofs"
DESCRIPTION = "This package includes the documentation for texlive-ofs"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn16991"

RPM_NAME = "texlive-ofs-doc-2026.226.svn16991-61.2.noarch.rpm"
RPM_HASH = "74a5f4825ee69a2d42f7b3d0fddad9f0e3b0030b02c25263454f9551d85baf3929624c8650297f4494649fa458be7a057ad2af5d50abf23ec527c22e761ccfc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ofs-doc-en;cs \
texlive-ofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
