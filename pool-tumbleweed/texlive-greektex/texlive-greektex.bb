SUMMARY = "Fonts for typesetting Greek/English documents"
DESCRIPTION = "The fonts are based on Silvio Levy's classical Greek fonts; \
macros and Greek hyphenation patterns for the fonts' encoding \
are also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn28327"

RPM_NAME = "texlive-greektex-2026.226.svn28327-60.4.noarch.rpm"
RPM_HASH = "cca168ad9d98e636617c1860e16d55129c9c95dfde51b65c1fb61c899b13527bc8b20bbba6fa8bf99fcaca3e1d058668d7bfb78895becdc33704331becdc15e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greektex.sty \
texlive-greektex"

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
