SUMMARY = "Binary files of pdflatexpicscale"
DESCRIPTION = "Binary files of pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn41779"

RPM_NAME = "texlive-pdflatexpicscale-bin-2026.20260301.svn41779-120.4.aarch64.rpm"
RPM_HASH = "db858604152b3b885f4241db4c91cbbbf11bb1f73312f8783990a7f3187ebb900ecdade04658c3577a74cfca3e24d45d95ea5892b1588f1bd4d640efbdeea0fc"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-bin"

RDEPENDS:${PN} += "texlive-pdflatexpicscale"

inherit rpm
