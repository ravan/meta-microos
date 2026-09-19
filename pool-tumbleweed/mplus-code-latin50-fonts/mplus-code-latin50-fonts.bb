SUMMARY = "Non-variable M PLUS Code Latin 50 font"
DESCRIPTION = "A monospaced font with 7 weights from Thin to Bold. \
M PLUS Code Latin 50 has a character aspect ratio of 0.5."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus-code-latin50-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "eb5f5db8e16329aecf09888f4d6c66c91c87791d56e3d3932a21e029c861abeea16d4ac6595db2d754ecfa7efa9fa7bd3fc448d4f09a2dbfedc5beb1196c323e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-code-latin50-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
