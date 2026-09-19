SUMMARY = "Noto Fangsong KSSRotated Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
FangsongKSSRotated font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-fangsongkssrotated-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "1484cbad9e7aa7eed78d3880d62e44482882b98f2f4ab436d8b407674ba1eed5765b36113ec6228ff3006638a9d6cb53b2201f4c07257377300bcdd7b02453b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-fangsongkssrotated-fonts \
noto-fangsongkssrotated \
noto-fangsongkssrotated-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
