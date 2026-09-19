SUMMARY = "Econometrics functions including MLE and GMM based techniques for Octave"
DESCRIPTION = "Econometrics functions including MLE and GMM based techniques. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "octave-forge-econometrics-1.1.2-1.26.aarch64.rpm"
RPM_HASH = "ebf6f9733cf4e69e3387356c793be173d0bec2f73c8d91c4db427229846e1c0c9103d6dc2406f3dd27f10464bab411b41e7616836cb0a9a6baee1d4e871f1a63"

RPROVIDES:${PN} += "octave-forge-econometrics"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-optim"

inherit rpm
