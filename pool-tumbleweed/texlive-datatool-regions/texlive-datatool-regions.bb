SUMMARY = "Region (numeric) support for datatool v3.0+"
DESCRIPTION = "The datatool-regions bundle provides the language-independent \
region ldf files for the datatool package (v3.0+). The *.ldf \
files should all be placed on TeX's path. These files don't \
require any explicit loading. They will automatically be input \
by datatool-base.sty (or relevant supplementary package) if \
they are found and required by the tracklang localisation \
settings. See the datatool v3.0+ and tracklang user manuals for \
further details. The region files deal with defining the \
currency symbol, and may additionally (if not dependent on the \
language) set the number group and decimal characters, and \
provide functions for parsing numeric dates and times. If a \
pre-3.0 version of datatool is installed, these ldf files will \
be ignored."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75712"

RPM_NAME = "texlive-datatool-regions-2026.226.1.0svn75712-61.2.noarch.rpm"
RPM_HASH = "cddc3b2ac12488368071ec44b977f9eaf72d412f38aba87e0054eff70aac714a66821e6ff8b54e0dbfa793b3270c535d31ba0b7e5c149ebbbd77897afe28ba7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datatool-AU.ldf \
tex-datatool-BE.ldf \
tex-datatool-CA.ldf \
tex-datatool-FK.ldf \
tex-datatool-GB.ldf \
tex-datatool-GG.ldf \
tex-datatool-GI.ldf \
tex-datatool-IE.ldf \
tex-datatool-IM.ldf \
tex-datatool-JE.ldf \
tex-datatool-NZ.ldf \
tex-datatool-US.ldf \
tex-datatool-ZA.ldf \
texlive-datatool-regions"

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
