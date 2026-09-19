SUMMARY = "Documentation for texlive-cweb"
DESCRIPTION = "This package includes the documentation for texlive-cweb"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-cweb-doc-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "c26696b41d5a540c2fcf906fd7a1cd3ee7c65e6a35cfe381d8f00ec9d200d95cdbdda78eb63f4e3239d5b2d0d02a40e92e66f044597e6ebc25f3e85e3051265e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctangle.1 \
man-ctwill-proofsort.1 \
man-ctwill-refsort.1 \
man-ctwill-twinx.1 \
man-ctwill.1 \
man-cweave.1 \
man-cweb.1 \
man-twill-refsort.1 \
man-twill.1 \
texlive-cweb-doc"

RDEPENDS:${PN} += ""

inherit rpm
