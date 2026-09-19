SUMMARY = "Binary files of tex4ht"
DESCRIPTION = "Binary files of tex4ht"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-tex4ht-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "3f8ee1d07f591592b1307bbdfd418ed167e98335cb2951e459fab17077ba0a2bd2bd7ae0136071083a41286e7d34542347126969d633fd5cdf3fe41371a1755b"

RPROVIDES:${PN} += "texlive-tex4ht-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex4ht"

inherit rpm
