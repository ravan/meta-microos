SUMMARY = "A LaTeX class to typeset recipes"
DESCRIPTION = "The layout design is relatively straightforward (and \
traditional: see 'sample output' under 'documentation'); the \
class uses the Bookman and the BrushScript-Italic fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.9svn54080"

RPM_NAME = "texlive-recipe-2026.226.0.0.9svn54080-60.4.noarch.rpm"
RPM_HASH = "d31bb17f67d02ee617be7231255d55dcc1ae509656639ab3e5c364f6c0ef4b2e17f0114a21a1015bf5ed449ce62e0948d5fa35eb0666c23192100e6593f50769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recipe.cls \
texlive-recipe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
