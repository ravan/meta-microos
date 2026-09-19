SUMMARY = "Documentation for texlive-tex4ht"
DESCRIPTION = "This package includes the documentation for texlive-tex4ht"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77990"

RPM_NAME = "texlive-tex4ht-doc-2026.227.svn77990-62.2.noarch.rpm"
RPM_HASH = "a91ce2c2500902ff4367fe40d6044b1e65a757cf300de003731b5d07ca040adb93df4ebfeb9ba319949b4cf3036b5b3f91b748ee2fb94ca37e4a32c8fe718deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex4ht-doc"

RDEPENDS:${PN} += ""

inherit rpm
