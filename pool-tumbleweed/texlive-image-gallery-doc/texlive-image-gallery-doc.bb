SUMMARY = "Documentation for texlive-image-gallery"
DESCRIPTION = "This package includes the documentation for texlive-image-gallery"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-doc-2026.226.1.0jsvn15878-60.2.noarch.rpm"
RPM_HASH = "100fd16866bb01dcdcc585f8d27b7cc83a3522fbd8ba171d1887ed95874e5b8e2ed7301cd59c6b7fe2ae05828fa951869c3ab221fe0ab93acb211ee6773c8795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-image-gallery-doc"

RDEPENDS:${PN} += ""

inherit rpm
