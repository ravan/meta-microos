SUMMARY = "Binary files of web"
DESCRIPTION = "Binary files of web"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-web-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "c43576cf4cc572812a81384eedc6ab4f093ef9d346feff39b756cc8b677999b7b1e4da03486f83dd1e739c4b52982bfa94ba54ca5786f00804f60320fed15bc2"

RPROVIDES:${PN} += "texlive-web-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-web"

inherit rpm
