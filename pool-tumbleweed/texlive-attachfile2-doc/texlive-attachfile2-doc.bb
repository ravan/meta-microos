SUMMARY = "Documentation for texlive-attachfile2"
DESCRIPTION = "This package includes the documentation for texlive-attachfile2"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12svn77682"

RPM_NAME = "texlive-attachfile2-doc-2026.226.2.12svn77682-60.2.noarch.rpm"
RPM_HASH = "81c201e0a037f655b72de489e16db0be3b2c49029f82e57664e64375ac2b3686cdb28ec45f2ab25413c4cd03b9f0a9d2622caabd0d825570dbaa525cd13f6af3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfatfi.1 \
texlive-attachfile2-doc"

RDEPENDS:${PN} += ""

inherit rpm
