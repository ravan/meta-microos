SUMMARY = "Documentation for texlive-zhlineskip"
DESCRIPTION = "This package includes the documentation for texlive-zhlineskip"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-doc-2026.226.1.0esvn51142-59.4.noarch.rpm"
RPM_HASH = "0b7531d387915528d7e9ba00c950ca7f176f001ad0455e6eb9aaf7ec4a9a95a7a6feb8133200b99d43ad4a7ffca0e9f1ce57da5817118a2ff9c02d25227ab488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlineskip-doc-zh \
texlive-zhlineskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
