SUMMARY = "Copenhagen University or faculty logo for front page"
DESCRIPTION = "A comprehensive package for adding University of Copenhagen or \
faculty logo to your front page. For use by student or staff at \
University of Copenhagen (Kobenhavns Universitet)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn45935"

RPM_NAME = "texlive-ku-template-2026.226.0.0.02svn45935-63.2.noarch.rpm"
RPM_HASH = "e4ae6116c40ca1761ab44526cae63c10dd9aa4050ec682dfd8119b3046414c62e6e18459693c3496451aa6ad084ac51e9561d916b4a5b50c7c52ca325a783c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ku-template.sty \
texlive-ku-template"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-titling.sty \
tex-wallpaper.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
