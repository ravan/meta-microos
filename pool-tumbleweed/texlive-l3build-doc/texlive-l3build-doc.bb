SUMMARY = "Documentation for texlive-l3build"
DESCRIPTION = "This package includes the documentation for texlive-l3build"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77170"

RPM_NAME = "texlive-l3build-doc-2026.226.svn77170-63.2.noarch.rpm"
RPM_HASH = "5f7442979c4b692cdf195c97357f17a5044c9b8e07498c61a0ac6cd2a19f4ee862fb4db360b1ef0275f50cd2fa9b3bcfed480470b114fcc2563a9e6f27d5f94f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-l3build.1 \
texlive-l3build-doc"

RDEPENDS:${PN} += ""

inherit rpm
