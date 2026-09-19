SUMMARY = "Noto Armenian Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Armenian Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-armenian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "8b89696d6fcfb539d62c363e606e931a69f04594249e62c887ae2cdac8306b00e97a2ea8fb9b7a6855842381cf7bc4ff252ddb8dba9e543ecac5b52758419eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-armenian-fonts \
noto-serif-armenian \
noto-serif-armenian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
