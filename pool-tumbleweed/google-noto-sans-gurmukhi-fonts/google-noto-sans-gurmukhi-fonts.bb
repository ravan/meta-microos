SUMMARY = "Noto Gurmukhi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-gurmukhi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8990d6c988bddebb742c27a70da0e8362776273529b71466e1e62b9189ec742f655c200db637c2225dbd58635e5dd61fec8b779a7c7ff981aa0fabab9f6e9f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-gurmukhi-fonts \
noto-sans-gurmukhi \
noto-sans-gurmukhi-fonts \
noto-sans-gurmukhi-ui \
noto-sans-gurmukhi-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
