SUMMARY = "Binary files of ltximg"
DESCRIPTION = "Binary files of ltximg"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn32346"

RPM_NAME = "texlive-ltximg-bin-2026.20260301.svn32346-120.4.aarch64.rpm"
RPM_HASH = "fe9334443224d9d48adfba8001d0b12c0f9a091af1e6f40f14f5721b0417211ac8a6febf739fbd157c21d2248d61545a1023ed74b01a4f0db847b6701ca177c4"

RPROVIDES:${PN} += "texlive-ltximg-bin"

RDEPENDS:${PN} += "texlive-ltximg"

inherit rpm
