SUMMARY = "Binary files of listbib"
DESCRIPTION = "Binary files of listbib"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn26126"

RPM_NAME = "texlive-listbib-bin-2026.20260301.svn26126-120.4.aarch64.rpm"
RPM_HASH = "553096b91f80a716530eff92dd7d6fbadbde5bdd2fd635a8b2b6fa5a7104cdc55f440837c8ed141da925639715b8fbf479fc9e2a44f6f588216f3d7338b66005"

RPROVIDES:${PN} += "texlive-listbib-bin"

RDEPENDS:${PN} += "texlive-listbib"

inherit rpm
