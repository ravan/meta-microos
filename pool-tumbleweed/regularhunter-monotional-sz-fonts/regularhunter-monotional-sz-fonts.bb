SUMMARY = "A humanist, monospace font based on DejaVu"
DESCRIPTION = "A humanist, monospace font based on DejaVu Sans Mono and inspired by \
André Berg's Meslo."
LICENSE = "OFL-1.1"

PV = "2.10"

RPM_NAME = "regularhunter-monotional-sz-fonts-2.10-1.3.noarch.rpm"
RPM_HASH = "8e7b889661582de53c8330d1e764e88d8e62e640ea478e6e2875b46261b9998dc89f6c4b0027af3bee36cb91b858d865ea7677f6b6d2bc163eef5e1d7786e270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regularhunter-monotional-sz-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
