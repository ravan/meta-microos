SUMMARY = "Noto Sans Traditional Chinese Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-mono-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "55d596733eeea54356d02add52d6f3813acd3fdfb6cb9e741d6cb9e4e37294c8b577718b687f766f3e3b0447dae30cf711f223364296725f6220b5c1c037cc05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-mono-fonts \
noto-sans-tc-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
