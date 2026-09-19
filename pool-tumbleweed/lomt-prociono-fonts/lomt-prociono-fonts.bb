SUMMARY = "League Of Movable Type's 'Prociono' font"
DESCRIPTION = "('Prociono' is an Esperanto word meaning either the star Procyon or \
the animal species known as the raccoon.) It is a roman serif font \
with blackletter elements."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-prociono-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "157fd72d3a2cd05b13514a9c166bb8e8534f6cc71cb8b337b4c129aecd23410151458bfdb4bb8c80ec7200ae18fc04100b4b624914b670b27fe5e30f7eac2ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-prociono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
