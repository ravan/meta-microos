SUMMARY = "Smooth-edge versions of int10h's IBM/PC fonts"
DESCRIPTION = "A modification of the int10h oldschoolpc font pack with some fonts \
redone with smooth edges."
LICENSE = "CC-BY-SA-4.0"

PV = "2.2.2"

RPM_NAME = "consoleet-oldschoolpc-fonts-2.2.2-1.2.noarch.rpm"
RPM_HASH = "9afc915c76d405c09ef191953ee15fd9dfc57993e17dbad3492d95604f53be4c5992e0444e31e9603f6e2bc91efa514d77f285c298ab888190badcc758daa81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-oldschoolpc-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
