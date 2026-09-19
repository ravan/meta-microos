SUMMARY = "Slide Deck Animation"
DESCRIPTION = "With the help of this package you can simulate animation in \
your slide deck, making it look similar to what PowerPoint can \
do."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.3svn73208"

RPM_NAME = "texlive-clicks-2026.226.0.0.4.3svn73208-60.2.noarch.rpm"
RPM_HASH = "0e422c49bd32694b5a52bf67b73f7ecedb397121fe3f65294cc6881f849e1b7a2bb7b4b7f517d58bec6a380656ed62d2bf6b4a3e56f11f1ce8f0acbff4f8db31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clicks.sty \
texlive-clicks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfopts.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
