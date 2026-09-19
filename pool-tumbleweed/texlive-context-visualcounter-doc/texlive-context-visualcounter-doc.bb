SUMMARY = "Documentation for texlive-context-visualcounter"
DESCRIPTION = "This package includes the documentation for texlive-context-visualcounter"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn47085"

RPM_NAME = "texlive-context-visualcounter-doc-2026.226.svn47085-61.2.noarch.rpm"
RPM_HASH = "f285cc787580096388db0162865026fc58371a169096b2d2c73ced34c5620a1e6b64a3a72ba660291769c6eb52fb83f47a5773f3a0730a7133bfe4dcf50cf5e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-visualcounter-doc"

RDEPENDS:${PN} += ""

inherit rpm
