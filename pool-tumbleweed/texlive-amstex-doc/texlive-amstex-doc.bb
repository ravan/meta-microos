SUMMARY = "Documentation for texlive-amstex"
DESCRIPTION = "This package includes the documentation for texlive-amstex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01svn77830"

RPM_NAME = "texlive-amstex-doc-2026.226.2.01svn77830-61.2.noarch.rpm"
RPM_HASH = "0c487254885cd02636af93245158fef1cf5998979c0e20e6d4fab14b0d9a16d300dc8dc89efb4c420a2c48c7d1853a9d69eebaecec8ca75b164e6b501d0100dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-amstex.1 \
texlive-amstex-doc"

RDEPENDS:${PN} += ""

inherit rpm
