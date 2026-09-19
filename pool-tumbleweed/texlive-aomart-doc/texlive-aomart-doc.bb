SUMMARY = "Documentation for texlive-aomart"
DESCRIPTION = "This package includes the documentation for texlive-aomart"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.36svn76110"

RPM_NAME = "texlive-aomart-doc-2026.226.1.36svn76110-61.2.noarch.rpm"
RPM_HASH = "c549e158d027ac749bddd96dbdf519c6c758966b599470db539997089ca2ce2e62a5cbe3a1aafa1031fa84865ddff5dea13308eb1468ee20369724b0a137a72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-aom-fullref.1 \
texlive-aomart-doc"

RDEPENDS:${PN} += ""

inherit rpm
