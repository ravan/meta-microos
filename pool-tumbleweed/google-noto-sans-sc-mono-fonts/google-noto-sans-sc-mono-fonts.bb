SUMMARY = "Noto Sans Simplified Chinese Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-mono-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "7cf60a4f236c49791d96515033c9e1157537c483188617c421fefbbef3de2fbb5da7713562708f2b517039a5ddfb4903392f6d673993774724fb4ff12d16a2c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-mono-fonts \
noto-sans-sc-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
