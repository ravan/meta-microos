SUMMARY = "Font for Runic Script"
DESCRIPTION = "A set of six Runic fonts that each cover the subset of 34 characters \
in the Unicode Runic block that are used in Frisian and Anglo-Saxon \
inscriptions from the 5th to 11th centuries."
LICENSE = "OFL-1.1"

PV = "20131112"

RPM_NAME = "babelstone-runic-fonts-20131112-4.9.noarch.rpm"
RPM_HASH = "2fd9e865b7e00f6f2ebdc956b238fe2152933525565b0d310d07c65cf773880dfd20e4a601a709a77c71908177956105d144402460e20883092f7ef93eef3258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-runic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
