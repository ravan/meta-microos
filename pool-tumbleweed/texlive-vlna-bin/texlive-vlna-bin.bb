SUMMARY = "Binary files of vlna"
DESCRIPTION = "Binary files of vlna"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-vlna-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "29895e6c3fddd27c0431be95501192bec11b9fb91388377c4490f028cb1f33557a1595eb3708f45f9ec72e860de8e7679e2d9d745d4b6b92ec8d2dc06791d78f"

RPROVIDES:${PN} += "texlive-vlna-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-vlna"

inherit rpm
