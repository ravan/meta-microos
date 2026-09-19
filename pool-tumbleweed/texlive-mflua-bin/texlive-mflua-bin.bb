SUMMARY = "Binary files of mflua"
DESCRIPTION = "Binary files of mflua"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-mflua-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "6c691d894ed6a4d6438fabc5d382a0705770b10ad7406af8ae5e6e371de233a1e028750f8d5800bb35559621adf7b0038df2b034395a36dba7d44512b369176c"

RPROVIDES:${PN} += "texlive-mflua-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpotrace.so.0 \
libtexlua53.so.5 \
libtexluajit.so.2 \
texlive-mflua"

inherit rpm
