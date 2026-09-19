SUMMARY = "Documentation for texlive-yquant"
DESCRIPTION = "This package includes the documentation for texlive-yquant"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn77263"

RPM_NAME = "texlive-yquant-doc-2026.226.0.0.9svn77263-59.4.noarch.rpm"
RPM_HASH = "bd7bc3ffd492199e01e4ef91921df8f57286219c598f97b94b648e6e685c223d7190d5abc1d9bc869af588cc72ec28b120ce31d4d9d17101b8210d836385f2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yquant-doc"

RDEPENDS:${PN} += ""

inherit rpm
