SUMMARY = "Binary files of omegaware"
DESCRIPTION = "Binary files of omegaware"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-omegaware-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "a2c5cecb5d692c020566921d488f77400dc8db23a9c94ecdfb968eddb02765f6d5759bed6f40fb4c350a376473d931d6e93d6f4fc546a33c4b33a0172a80b3e7"

RPROVIDES:${PN} += "texlive-omegaware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-omegaware \
texlive-uptex-bin"

inherit rpm
