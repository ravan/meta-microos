SUMMARY = "Korean TrueType fonts"
DESCRIPTION = "Korean TrueType fonts by A Lee."
LICENSE = "Artistic-1.0+"

PV = "13.3"

RPM_NAME = "alee-fonts-13.3-1.10.noarch.rpm"
RPM_HASH = "4441e01c6d381b2b84d1cebcf68cd8fe154ddad257e57dbef6366019b168e335b0bd00bfcbacf9c0149400b32055145140eb33ce475a07f7e6766e4800bd035b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alee-fonts \
locale-ko \
scalable-font-ko \
ttf-alee"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
