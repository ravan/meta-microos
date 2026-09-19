SUMMARY = "Documentation for texlive-kantlipsum"
DESCRIPTION = "This package includes the documentation for texlive-kantlipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8csvn77682"

RPM_NAME = "texlive-kantlipsum-doc-2026.226.0.0.8csvn77682-63.2.noarch.rpm"
RPM_HASH = "4e6d9a44a92cba74db112e06a0c29c42f1ee9b634374e1de9d81e5d2883324050757526d4c36d8a921ea81521bb12e866721c64811aeaf0f58f20e22212695dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kantlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
