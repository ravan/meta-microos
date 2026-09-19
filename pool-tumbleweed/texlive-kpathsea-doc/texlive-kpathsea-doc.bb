SUMMARY = "Documentation for texlive-kpathsea"
DESCRIPTION = "This package includes the documentation for texlive-kpathsea"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.svn77861"

RPM_NAME = "texlive-kpathsea-doc-2026.226.svn77861-63.2.noarch.rpm"
RPM_HASH = "3288d9a25cabeabda2b6b5ecd81e1e73d02c5b93fc24eda2df6765f5b545e9ca3ebc67f1a02f34cb52c8758f7c9d57d12bd059a7abc9fc915e5bf2cee3441d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-kpseaccess.1 \
man-kpsereadlink.1 \
man-kpsestat.1 \
man-kpsewhich.1 \
texlive-kpathsea-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
