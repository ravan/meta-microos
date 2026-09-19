SUMMARY = "A bitmap programming font"
DESCRIPTION = "A bitmap font with great coverage of all the glyphs \
that might encounter in the terminal."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "cozette-fonts-1.30.0-1.2.noarch.rpm"
RPM_HASH = "179da8aba777905e63f209950a955e6dea1646d0d152142cb8eaf7a7e3d371bb59a2a71a19bd4a87b0f9473b93f3bbd2b17d776fc4448213bfcb159ab695a6cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cozette-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
