SUMMARY = "Cadson Demak fonts"
DESCRIPTION = "Cadson Demak fonts are inspired from an old Thai font design, which give old traditional vibes but works well on modern design."
LICENSE = "OFL-1.1"

PV = "0.0+git.1535343411.3adc93a"

RPM_NAME = "cadsondemak-fonts-0.0+git.1535343411.3adc93a-1.18.noarch.rpm"
RPM_HASH = "a373082a268cbc150c5c9a19cd216a702f22d48bc4a0ea1d4b722d774e727187020e06af5cbdae7c8b42eaf7142c3ee7fffa85f209c542a041632e74ce177eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cadsondemak-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
