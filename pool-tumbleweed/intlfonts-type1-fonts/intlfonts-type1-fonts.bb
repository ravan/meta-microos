SUMMARY = "Type1 Fonts from the GNU Intlfonts Package"
DESCRIPTION = "Type1 fonts from the GNU intlfonts package."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-type1-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "4ee716de9242cb9c4cc3ffcbe1b41764e34330893d19a5428bd4bfc9509059afcab9f45efb7d380c1f7c0e2f66820eb7bcc86882a2702d38720315bacc955c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intlfonts-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
