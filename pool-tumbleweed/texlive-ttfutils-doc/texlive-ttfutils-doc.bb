SUMMARY = "Documentation for texlive-ttfutils"
DESCRIPTION = "This package includes the documentation for texlive-ttfutils"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-ttfutils-doc-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "dde8241d94dcc37152a6322198abdee87333b24092411d945e2adfbe2047405557276c0e2e91eb6acd6bda2f759db455233c2b8a67c48dda95659395cefa3a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ttf2afm.1 \
man-ttf2pk.1 \
man-ttf2tfm.1 \
man-ttfdump.1 \
texlive-ttfutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
