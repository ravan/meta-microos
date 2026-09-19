SUMMARY = "Binary files of xdvi"
DESCRIPTION = "Binary files of xdvi"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-xdvi-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "bb058a688b7bab01c694a9f70a9b29cc4ae2d1de3cf5949091d61ee8b823550203beb40806ae9764e2252330c630cfdce82970700c6af69f06fd1ab5ca479e51"

RPROVIDES:${PN} += "texlive-xdvi-bin"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXi.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-xdvi"

inherit rpm
