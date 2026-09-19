SUMMARY = "Binary files of ps2eps"
DESCRIPTION = "Binary files of ps2eps"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-ps2eps-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "882344f3b36867c945e1c2170522275f3ddc85dab94c091232e16088fa9a12e5052f5ce677182a7f53d8e692440424a8c4592b31456f3202cf690f0687fc0ca3"

RPROVIDES:${PN} += "texlive-ps2eps-bin \
texlive-pstools-bin-/usr/bin/bbox \
texlive-pstools-bin-/usr/bin/ps2eps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-ps2eps"

inherit rpm
