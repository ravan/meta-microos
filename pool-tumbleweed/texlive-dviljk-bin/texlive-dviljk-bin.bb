SUMMARY = "Binary files of dviljk"
DESCRIPTION = "Binary files of dviljk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-dviljk-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "4f4edbf56e510481dead47298b8f8424d2c14b5654e5644f88e317e4539182bc35d24cd0d6695141d6c690e537bfcea5b5f8e80247a441270c9015186bdd0c1b"

RPROVIDES:${PN} += "texlive-bin-dvilj \
texlive-dviljk-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dviljk"

inherit rpm
