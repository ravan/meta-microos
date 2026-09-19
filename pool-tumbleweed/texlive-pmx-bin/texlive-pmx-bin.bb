SUMMARY = "Binary files of pmx"
DESCRIPTION = "Binary files of pmx"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-pmx-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "4b036879d2202c233f74d174b3a52bebe0732427d58d7388d181aacc1a3e009152b1a0dae1c412b1e63c411de1c6b572dd96a2d5ddaf3c414c078f7d87125e2d"

RPROVIDES:${PN} += "texlive-pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-pmx"

inherit rpm
