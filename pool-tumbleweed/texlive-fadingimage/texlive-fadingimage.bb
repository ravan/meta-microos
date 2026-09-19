SUMMARY = "Add full width fading pictures at the top or bottom of a page"
DESCRIPTION = "This package provides commands for adding full width fading \
pictures at the top or bottom of a page. It is based on TikZ \
with the fadings library. Welcome to feedback bugs or ideas via \
email to xiamyphys@gmail.com."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn75447"

RPM_NAME = "texlive-fadingimage-2026.226.0.0.3asvn75447-59.2.noarch.rpm"
RPM_HASH = "b089ce5e083b452cf29e2eccea811f556b506cb9ec3cea9955203e5ddec224be035184175d7e027fd13bc5268ccc846fb89aec6041dcac6d78af729c3bba2998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fadingimage.sty \
texlive-fadingimage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
