SUMMARY = "Documentation for texlive-jigsaw"
DESCRIPTION = "This package includes the documentation for texlive-jigsaw"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn71923"

RPM_NAME = "texlive-jigsaw-doc-2026.226.0.0.5svn71923-63.2.noarch.rpm"
RPM_HASH = "55ac728abcef4ac589ba42e411abda9fdf4373f9ad36ae5fd8c2991ab2375f67bd827e23a17224c6fd4bf95e73c01619a9bfa139c487cb86bd7a1ca557a3a396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jigsaw-doc"

RDEPENDS:${PN} += ""

inherit rpm
