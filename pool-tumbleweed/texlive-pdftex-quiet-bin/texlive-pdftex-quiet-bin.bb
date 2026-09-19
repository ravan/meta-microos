SUMMARY = "Binary files of pdftex-quiet"
DESCRIPTION = "Binary files of pdftex-quiet"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn49140"

RPM_NAME = "texlive-pdftex-quiet-bin-2026.20260301.svn49140-120.4.aarch64.rpm"
RPM_HASH = "527ca73d5716727dff16e06c5c7d5158b6340410c13a0858728a888137fd40e458c0679af6482b162c3219ff7e4b998cb306d54da6cbf77d91e57c87ee8f54dc"

RPROVIDES:${PN} += "texlive-pdftex-quiet-bin"

RDEPENDS:${PN} += "texlive-pdftex-quiet"

inherit rpm
