SUMMARY = "Noto Sans Korean Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-mono-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "9808fdaa7ee4bd09056913c787307ff678535587dbdd3c7ea0dcead80ab1d80513ae7b02b84c51c515fad08d3d791fd0b17a3450d0dfa8aa62a66580765036f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-mono-fonts \
noto-sans-kr-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
