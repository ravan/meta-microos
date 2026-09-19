SUMMARY = "Document class for the journal of DANTE"
DESCRIPTION = "The bundle provides a class and style file for typesetting 'Die \
TeXnische Komodie' -- the communications of the German TeX \
Users Group DANTE e.V. The arrangement means that the class may \
be used by article writers to typeset a single article, as well \
as to produce the complete journal."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.10fsvn71776"

RPM_NAME = "texlive-dtk-2026.226.2.10fsvn71776-59.2.noarch.rpm"
RPM_HASH = "7ca8903b377ef2e0c11ceae6f9bc31f3aefee27b63ed0824f105eb65f0c88b055d0c5f7d8b2d6939423487d65d27350fa93d9b03677f883efe336c739a590071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtk-author.clo \
tex-dtk-fonts.clo \
tex-dtk-full.clo \
tex-dtk-url.sty \
tex-dtk.bbx \
tex-dtk.cbx \
tex-dtk.cls \
texlive-dtk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-babel.sty \
tex-chem-angew.bbx \
tex-csquotes.sty \
tex-datetime2.sty \
tex-embedfile.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-eurosym.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hvextern.sty \
tex-hvlogos.sty \
tex-hvqrurl.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-libertinus-otf.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-multicol.sty \
tex-newunicodechar.sty \
tex-numeric.cbx \
tex-pdfescape.sty \
tex-picture.sty \
tex-ragged2e.sty \
tex-scrhack.sty \
tex-scrlayer-scrpage.sty \
tex-selnolig.sty \
tex-splitidx.sty \
tex-tabularx.sty \
tex-trimspaces.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
