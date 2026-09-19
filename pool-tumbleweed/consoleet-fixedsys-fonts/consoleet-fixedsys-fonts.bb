SUMMARY = "Smooth-edge version of Fixedsys Excelsior"
DESCRIPTION = "Smooth-edge versions of the Fixedsys Excelsior font."
LICENSE = "SUSE-Public-Domain"

PV = "3.09.10"

RPM_NAME = "consoleet-fixedsys-fonts-3.09.10-1.2.noarch.rpm"
RPM_HASH = "45b5e431af0c77ecd7fe07a71d9610064c80fb8c5eb29a76edc8047cb1d2942802625b8350d5edc8a5475952cc1a72d91321d9d5901690826cc8885b69d1681d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-fixedsys-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
