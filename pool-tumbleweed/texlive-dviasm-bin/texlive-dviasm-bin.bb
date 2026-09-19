SUMMARY = "Binary files of dviasm"
DESCRIPTION = "Binary files of dviasm"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn8329"

RPM_NAME = "texlive-dviasm-bin-2026.20260301.svn8329-120.4.aarch64.rpm"
RPM_HASH = "25a5f0a408579cbee4e80c5d1fa27409d5cdb7913b4a804611f73d3804d867d8969c4b3199b720804a7bd4a8d462b80c5092604dda6c901160d2abb84bab1a77"

RPROVIDES:${PN} += "texlive-dviasm-bin"

RDEPENDS:${PN} += "texlive-dviasm"

inherit rpm
