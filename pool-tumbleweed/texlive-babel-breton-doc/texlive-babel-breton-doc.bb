SUMMARY = "Documentation for texlive-babel-breton"
DESCRIPTION = "This package includes the documentation for texlive-babel-breton"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0isvn77470"

RPM_NAME = "texlive-babel-breton-doc-2026.226.1.0isvn77470-60.2.noarch.rpm"
RPM_HASH = "ea84ee44ca54bb26353ca6729b954c65c5c1ccfa7ff31a013fe233d5ef09db4926e86be35f8b25a66cac16f33ce1ba6a265f6c1776991820f2cdaee707bb1495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-breton-doc"

RDEPENDS:${PN} += ""

inherit rpm
