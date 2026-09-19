SUMMARY = "Binary files of fragmaster"
DESCRIPTION = "Binary files of fragmaster"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13663"

RPM_NAME = "texlive-fragmaster-bin-2026.20260301.svn13663-120.4.aarch64.rpm"
RPM_HASH = "79df7ae6a095887c53db41cc1c6a6f6449f81272b628123df188f53aaea64e30861c158594d8d3330b2b424ab0ee264653de562599d6a28729278c9555197fed"

RPROVIDES:${PN} += "texlive-fragmaster-bin"

RDEPENDS:${PN} += "texlive-fragmaster"

inherit rpm
