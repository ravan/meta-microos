SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-bibliography package extends the BibLaTeX package with \
some functionality mostly useful for high energy physics. In \
particular it makes full use of all BibTeX fields provided by \
Discover High-Energy Physics. The package is loaded with \
\\usepackage{hep-bibliography}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-bibliography-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "7e318aa54beecbe8ce55a79719081c4000a4954a8b5efee2349843b259cdf467f3cdfa7e4f75e221c0cd70124c34c0bcbe3c311e99b12d6ee2564dea242ddbc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-bibliography.sty \
texlive-hep-bibliography"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-kvoptions.sty \
tex-relsize.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
