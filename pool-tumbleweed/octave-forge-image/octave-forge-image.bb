SUMMARY = "Image Processing for Octave"
DESCRIPTION = "Functions for processing images. The package also provides functions \
for feature extraction, image statistics, spatial and geometric \
transformations, morphological operations, linear filtering, and much more. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & MIT"

PV = "2.18.1"

RPM_NAME = "octave-forge-image-2.18.1-1.7.aarch64.rpm"
RPM_HASH = "ce3e71d28ab3b045eeb12be2e974dbe94d7e9143c986669e8d6d0d75619866e2a4086afa423cd895d0a10f925f6d17f9017c8b5cf7dbfb231c1477fb1bcfaa20"

RPROVIDES:${PN} += "octave-forge-image"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
