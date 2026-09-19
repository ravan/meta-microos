SUMMARY = "Endnotes for LaTeX"
DESCRIPTION = "This is an endnotes package for LaTeX. Its user interface \
provides means to print multiple sections of notes along the \
document, and to subdivide them either automatically -- by \
chapter, by section -- or at manually specified places, thus \
being able to easily handle both numbered and unnumbered \
headings. The package also provides infrastructure for setting \
up contextual running headers for printed notes. The default is \
a simple but useful one, in the form 'Notes to pages N-M', but \
more elaborate ones can be built. When hyperref is loaded, \
postnotes provides hyperlinked notes, including back links."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn77682"

RPM_NAME = "texlive-postnotes-2026.226.0.0.5.1svn77682-59.2.noarch.rpm"
RPM_HASH = "6447d77656bd770387fb4e83daabb4b50aa070a179998b54c9e3b536a409de35129d43d6bc6d3f7879b0e5afdc2dc19e71b7e2b5de8980df1170353a5fe2b207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postnotes.sty \
texlive-postnotes"

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
