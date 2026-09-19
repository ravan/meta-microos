SUMMARY = "Create handout for auditors of a talk"
DESCRIPTION = "In some fields of scholarship, a beamer does not offer good \
support when giving a talk in a proceeding. For example, in \
classical philology, the main sources are text, and it will be \
better to distribute a handout to the audience with extracts of \
the texts about which we will talk. The package supports \
preparation of such handouts when writing the talk."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.0svn43962"

RPM_NAME = "texlive-handout-2026.226.1.6.0svn43962-60.4.noarch.rpm"
RPM_HASH = "f3fd7e3b91f678fd2953acf49c4674a50e8950d38cccd797f96fe51878e34f703248f86777ec4329d50d9d60eff6620f9351b35dde736d44d500b2d7bffceca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handout.sty \
texlive-handout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
