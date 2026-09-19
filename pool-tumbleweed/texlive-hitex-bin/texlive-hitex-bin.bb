SUMMARY = "Binary files of hitex"
DESCRIPTION = "Binary files of hitex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77966"

RPM_NAME = "texlive-hitex-bin-2026.20260301.svn77966-120.4.aarch64.rpm"
RPM_HASH = "107d0f1f60c32230581fdfa952b862174bf8181a6e381e75a2ba284811f386170ab30d0dc40a124c092e99695752d2756042d3048ec252ce92321c76df860382"

RPROVIDES:${PN} += "texlive-hitex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libkpathsea.so.6 \
libz.so.1 \
texlive-hitex"

inherit rpm
