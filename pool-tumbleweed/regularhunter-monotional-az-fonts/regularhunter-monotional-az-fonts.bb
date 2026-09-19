SUMMARY = "A humanist, monospace font based on DejaVu"
DESCRIPTION = "A humanist, monospace font based on DejaVu Sans Mono and inspired by \
André Berg's Meslo."
LICENSE = "OFL-1.1"

PV = "2.10"

RPM_NAME = "regularhunter-monotional-az-fonts-2.10-1.3.noarch.rpm"
RPM_HASH = "54b5cec33e50bf71571665a9e9cb870aab4a66b1cb3d08e4776ae6a47d688e9b0213db598b9af19cd886be2a3ab2451361ee11c06dc7ed1621df891beab39cf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regularhunter-monotional-az-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
