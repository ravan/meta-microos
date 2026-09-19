SUMMARY = "Noto Sign Writing Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SignWriting Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-signwriting-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "219a023fc1afb678838d1f2637c864a9abb7fc982a3cb051ba2731fedc170da74282f3d51be426687b3b3ddb0bf579ec2cf5a278e8411815b6fd8763f291f5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-signwriting-fonts \
noto-sans-signwriting \
noto-sans-signwriting-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
