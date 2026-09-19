SUMMARY = "Binary files of kpathsea"
DESCRIPTION = "Binary files of kpathsea"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-kpathsea-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "52f1b1b1c5db31f954666c22d08ff4338db6a0fee12bab251c8e52a829a9d6c4e62e0051dce500b05b51f5781dd751298f81916dc1c161a48f9c6ad8ee3e761a"

RPROVIDES:${PN} += "texlive-kpathsea-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
group-mktex \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
permissions \
texlive-filesystem \
texlive-gsftopk-bin \
texlive-kpathsea \
texlive-scripts-bin \
user-mktex"

inherit rpm
