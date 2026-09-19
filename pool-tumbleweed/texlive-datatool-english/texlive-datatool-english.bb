SUMMARY = "English language support for datatool.sty v3.0+"
DESCRIPTION = "The datatool-english bundle provides English language support \
for the datatool package (v3.0+). The *.ldf files should all be \
placed somewhere on TeX's path. These files don't require any \
explicit loading. They will automatically be input by \
datatool-base.sty (or relevant supplementary package) if they \
are found and required by the tracklang localisation settings. \
See the datatool v3.0+ and tracklang user manuals for further \
details. The English files provide encoding support for UTF-8 \
and ISO-8859-1 (Latin 1). Any other encoding will be treated as \
US-ASCII. This bundle also includes limited support for Old \
English (Anglo-Saxon) mainly to provide an example for a \
language that has multiple scripts (in this case, Latin and \
Runic) or for a language that has an extended Latin or \
non-Latin script. The language codes are ang-Latn for \
Anglo-Saxon Latin Script and ang-Runr for Anglo-Saxon Runic \
Script. There's only support for UTF-8 with the Anglo-Saxon \
files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn74590"

RPM_NAME = "texlive-datatool-english-2026.226.1.1svn74590-61.2.noarch.rpm"
RPM_HASH = "7f7529398aebc289e964f5af55350e1317afddce3f269bd9f4f294d8065166f9f8ae2e3b429ac54248ae3488a04a9dad012cbe760304fb05f23cec33985b4808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-databib-english.ldf \
tex-datatool-ang-Latn-utf8.ldf \
tex-datatool-ang-Latn.ldf \
tex-datatool-ang-Runr-utf8.ldf \
tex-datatool-ang-Runr.ldf \
tex-datatool-anglosaxon.ldf \
tex-datatool-en-CA.ldf \
tex-datatool-en-ZA.ldf \
tex-datatool-english-ascii.ldf \
tex-datatool-english-latin1.ldf \
tex-datatool-english-utf8.ldf \
tex-datatool-english.ldf \
tex-person-english.ldf \
texlive-datatool-english"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-datatool \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
