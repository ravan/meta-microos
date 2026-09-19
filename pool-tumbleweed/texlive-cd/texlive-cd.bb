SUMMARY = "Typeset CD covers"
DESCRIPTION = "Normal usage will ordinarily require no more than a simple data \
file per cover; the package will make a full insert for a CD \
case (it copes with both normal and slim cases)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn34452"

RPM_NAME = "texlive-cd-2026.226.1.4svn34452-59.2.noarch.rpm"
RPM_HASH = "fea09f70c65cacb1db7b7f0270f6f1938b60ce42b798eb4ca4f33fe02b332b92bbf9c54590583417b6c1064a5ee7fd42addd71ab9d45db0591db924e262a92b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cd.cls \
texlive-cd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
