SUMMARY = "Binary files of cjkutils"
DESCRIPTION = "Binary files of cjkutils"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-cjkutils-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "3d3f5d111d4c632a3a070a4cdc6e26a6ab337d348d9554cf28d9257a132eebfb6488aaaf450778a3b19de6523bdfad5152544a463e06c45b62388f4eda9edcea"

RPROVIDES:${PN} += "texlive-cjkutils-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cjkutils"

inherit rpm
