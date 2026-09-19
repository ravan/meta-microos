SUMMARY = "PCM Virtual Down-mix Plug-In for ALSA Library"
DESCRIPTION = "This package contains a PCM filter plugin that performs virtual down-mixing \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-vdownmix-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "570578755bda2664b9a8c78efecc14ac0fab54ba5f044ded2962201096a3879b7ba3848482dc96d9840e47c5fb3efe274f724183427b79af34c3bbae0eb914eb"

RPROVIDES:${PN} += "alsa-plugins-vdownmix \
libasound-module-pcm-vdownmix.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
