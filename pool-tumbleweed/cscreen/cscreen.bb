SUMMARY = "Console screen"
DESCRIPTION = "This package allows to run multiple consoles in one 'screen' and \
to start the screen automatically during boot."
LICENSE = "BSD-4-Clause"

PV = "1.8"

RPM_NAME = "cscreen-1.8-1.7.noarch.rpm"
RPM_HASH = "9f60ae7e51c79e82324b0b08aa0591c530469ce800ebe3baa99e62600f2cb90b48c8d13b18f46a820728b771edbb609972c0341f9298842e7654b0efae011f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-cscreen \
cscreen"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
group--cscreen \
screen \
sudo \
system-user-cscreen \
user--cscreen"

inherit rpm
