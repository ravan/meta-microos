SUMMARY = "Fonts for TV Applications"
DESCRIPTION = "This package includes some X Window System bitmap fonts for TV \
applications:  large fonts frequently used in on-screen displays, \
teletext font, and more."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "tv-fonts-1.1-450.7.noarch.rpm"
RPM_HASH = "e46fca0beb95ca89bf63ab1a1d7e05c344cf4ea5f7889772896465b2987647775e691299abf50648414019862189e62cb244956c6464e103b64f3b884e67cbcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tv-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
