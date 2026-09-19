SUMMARY = "Utilities to derive new fonts from existing ones"
DESCRIPTION = "The accfonts package contains three utilities to permit easy \
manipulation of fonts, in particular the creation of unusual \
accented characters. Mkt1font works on Adobe Type 1 fonts, \
vpl2vpl works on TeX virtual fonts and vpl2ovp transforms a TeX \
font to an Omega one. All three programs read in a font (either \
the font itself or a property list), together with a simple \
definition file containing lines such as '128 z acute'; they \
then write out a new version of the font with the requested new \
characters in the numerical slots specified. Great care is \
taken over the positioning of accents, and over the provision \
of kerning information for new characters; mkt1font also \
generates suitable 'hints' to enhance quality at small sizes or \
poor resolutions. The programs are written in Perl."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.25svn18835"

RPM_NAME = "texlive-accfonts-2026.226.0.0.25svn18835-61.2.noarch.rpm"
RPM_HASH = "4962ad204453fde5da3eafb7bf8a85c0d1d7f06a33f64ed25d8fed22f3fe04f5fe645f176006693bf7d79517ea93e0079f0e6c3b338953a616dcd227eab874d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CSX.def \
tex-ISO-Latin1.def \
tex-ISO-Latin2.def \
tex-IndUni-Omega.def \
tex-Norman.def \
texlive-accfonts"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-Getopt--Std \
sed \
texlive \
texlive-accfonts-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
