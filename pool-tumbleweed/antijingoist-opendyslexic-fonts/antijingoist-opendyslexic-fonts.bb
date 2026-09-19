SUMMARY = "OpenDyslexic Fonts"
DESCRIPTION = "OpenDyslexic, a typeface that uses typeface shapes & features to help offset \
some visual symptoms of Dyslexia."
LICENSE = "OFL-1.1"

PV = "0.91.12"

RPM_NAME = "antijingoist-opendyslexic-fonts-0.91.12-1.17.noarch.rpm"
RPM_HASH = "b3dbeaa82ee466d5055b87bf1e0144147a62345f918c2f23dea65a34e36744f16784f3267c3b4cce9f0ab31d4254346be9a74667806adc0eae3f6007afda6e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antijingoist-opendyslexic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
