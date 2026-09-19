SUMMARY = "Documentation for texlive-cjkutils"
DESCRIPTION = "This package includes the documentation for texlive-cjkutils"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.8.5svn60833"

RPM_NAME = "texlive-cjkutils-doc-2026.226.4.8.5svn60833-60.2.noarch.rpm"
RPM_HASH = "4124c43fd5d0ce11fc36c7cfd72675c3462c12c3e5b9fc0836f20bd4fb3736e19c21fadc42aad59bc3aa1794bbafb6c385c584c77b69712a679d6bbb3266b15c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bg5conv.1 \
man-cef5conv.1 \
man-cefconv.1 \
man-cefsconv.1 \
man-extconv.1 \
man-hbf2gf.1 \
man-sjisconv.1 \
texlive-cjkutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
