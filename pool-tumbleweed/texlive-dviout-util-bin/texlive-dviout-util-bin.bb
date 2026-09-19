SUMMARY = "Binary files of dviout-util"
DESCRIPTION = "Binary files of dviout-util"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-dviout-util-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "0b2a4e375afd66f4fe7efb50844c88730015927ac2ee487305b667cc8ad94e897492c65d71fdd6dfee5802d8ed8b87236d165899fec1afbbd00a851d10d9562d"

RPROVIDES:${PN} += "texlive-dviout-util-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libptexenc.so.1 \
texlive-dviout-util"

inherit rpm
