SUMMARY = "An introduction to the Beamer class, in Portuguese"
DESCRIPTION = "The beamer-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-beamer-tut-pt-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "a12eb8ffcaf9c4b1cf39bdf6468374088f1e41b21b0f0ec869bcc594f71d240cd3182ce6bb17d91c26b79d9821e3ab5b5f6c47eb67d6fc93385e180c944adbb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-tut-pt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
