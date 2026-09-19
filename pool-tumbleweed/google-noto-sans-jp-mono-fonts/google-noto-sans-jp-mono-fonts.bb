SUMMARY = "Noto Sans Japanese Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-mono-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "73a17dd263e2220b3ff255bd46421893341a563e72d17c325dd3f0120ce21ecb0586eebcbf96219307cc72de360ba572ada86bdd85fdb57d762fb0adae28a174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-mono-fonts \
noto-sans-jp-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
