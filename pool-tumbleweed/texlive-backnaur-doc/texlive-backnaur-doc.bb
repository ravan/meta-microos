SUMMARY = "Documentation for texlive-backnaur"
DESCRIPTION = "This package includes the documentation for texlive-backnaur"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn54080"

RPM_NAME = "texlive-backnaur-doc-2026.226.3.1svn54080-60.2.noarch.rpm"
RPM_HASH = "e4ea69c6466c1fab9ca199bf9ef349b29f5c1efd0ddd94929dd01c8fd502f791a91543e9b449cd71ba2f86caff59c1ffae370070069b2c3320cab3854852da72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-backnaur-doc"

RDEPENDS:${PN} += ""

inherit rpm
