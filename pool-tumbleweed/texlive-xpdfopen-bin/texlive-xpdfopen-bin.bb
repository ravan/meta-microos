SUMMARY = "Binary files of xpdfopen"
DESCRIPTION = "Binary files of xpdfopen"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-xpdfopen-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "a3eef9d241576e4ec43310f3b1bcf5397779d47a4455ccda965428c78d5518dfd088970ae56651251e77d731f9f1f0659c9fdc91319a11dd59b2d814d20c57f1"

RPROVIDES:${PN} += "texlive-xpdfopen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
texlive-xpdfopen"

inherit rpm
