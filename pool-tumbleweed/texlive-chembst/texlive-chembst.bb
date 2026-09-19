SUMMARY = "A collection of BibTeX files for chemistry journals"
DESCRIPTION = "The package offers a collection of advanced BibTeX style files \
suitable for publications in chemistry journals. Currently, \
style files for journals published by the American Chemical \
Society, Wiley-VCH and The Royal Society of Chemistry are \
available. The style files support advanced features such as \
automatic formatting of errata or creating an appropriate entry \
for publications in Angewandte Chemie where both English and \
German should be cited simultaneously."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.5svn76790"

RPM_NAME = "texlive-chembst-2026.226.0.0.2.5svn76790-60.2.noarch.rpm"
RPM_HASH = "a3e1916fb50c5f2f38e0edffbbcf9d9bde2a77873ef23e3a60ad84a81184c18bd07bf496720b787be3fdf6fe7a7e19909e11b1e601de729a6afb8d4d15c9475b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chembst"

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
