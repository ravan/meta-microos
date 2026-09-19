SUMMARY = "Documentation for texlive-pseudo"
DESCRIPTION = "This package includes the documentation for texlive-pseudo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.3svn76924"

RPM_NAME = "texlive-pseudo-doc-2026.226.1.2.3svn76924-59.2.noarch.rpm"
RPM_HASH = "43c7d954b88c87344fdba2d5c83500f69edffbf4550f820f6eac81a0893bb186e363e5672eeb8409b05818c920fc7bbcfbe87aa7921f7ee1670e93c90332c78f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pseudo-doc"

RDEPENDS:${PN} += ""

inherit rpm
