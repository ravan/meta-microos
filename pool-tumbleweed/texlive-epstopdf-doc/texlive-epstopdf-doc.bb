SUMMARY = "Documentation for texlive-epstopdf"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.36svn71782"

RPM_NAME = "texlive-epstopdf-doc-2026.226.2.36svn71782-61.4.noarch.rpm"
RPM_HASH = "75573aea71d45afd47c1c9d299014f760e0351caeb6ef44541dc8ae173a440c3398c703bfc74b5ad97b3af0c332e901dc6c40df65654f73ef42740bcbb63b13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-epstopdf.1 \
man-repstopdf.1 \
texlive-epstopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
