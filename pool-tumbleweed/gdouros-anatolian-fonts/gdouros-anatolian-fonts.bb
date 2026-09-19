SUMMARY = "Anatolian Hieroglyphs"
DESCRIPTION = "Anatolian is a work-font, encoding Anatolian Hieroglyphs in F200 - F4FF of \
the Private Use Area of the BMP. There are no plans to improve or expand it."
LICENSE = "SUSE-Permissive"

PV = "5.17"

RPM_NAME = "gdouros-anatolian-fonts-5.17-1.25.noarch.rpm"
RPM_HASH = "4708f38a2a635d2e82c644a8f550897b39b0416afc548cd08346c4a5e39e270e13e7824b142260b37c7c0875a57ff7730fad5219cb7dfc16b58e35c63f820abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "anatolian-fonts \
gdouros-anatolian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
