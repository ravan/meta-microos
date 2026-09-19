SUMMARY = "Development files for VapourSynth"
DESCRIPTION = "Header files and pkg-config files for VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "79"

RPM_NAME = "vapoursynth-devel-79-1.1.aarch64.rpm"
RPM_HASH = "60e5fb68c053721ceaf9b669c76d86dc5ba25519ea2f5043b34334bf39e3af8d9f67b9b44605d472b8164967a00f4dd512d9f2807fbcbf1b11ea274c313f7aff"

RPROVIDES:${PN} += "pkgconfig-vapoursynth \
vapoursynth-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvapoursynth4 \
libvsscript0"

inherit rpm
