SUMMARY = "BabelStone Font for Ogham Script"
DESCRIPTION = "A set of twelve Unicode Ogham fonts in seven font families, representing \
a variety of different styles of Ogham letters found in manuscripts and \
on Ogham stone inscriptions."
LICENSE = "OFL-1.1"

PV = "20220314"

RPM_NAME = "babelstone-ogham-fonts-20220314-1.9.noarch.rpm"
RPM_HASH = "e9148c87422ada001c8d5c7e8593a91dca05eed1c51793b8b6f3031e68128d050903b11cc32da1b1ca00cd0e94caaf8615add172f9aba2f44f94aefdec23a27e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-ogham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
