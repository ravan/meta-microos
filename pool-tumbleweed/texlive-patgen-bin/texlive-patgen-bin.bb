SUMMARY = "Binary files of patgen"
DESCRIPTION = "Binary files of patgen"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-patgen-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "a2239f913656c834b73cd38b150ebefb2eb5ab7e85281e19f6f0e261f57769c509d544cd98559126c2fd0046853966cc30511fda98a6595edf5bb3c287a31494"

RPROVIDES:${PN} += "texlive-patgen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-patgen"

inherit rpm
