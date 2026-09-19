SUMMARY = "LaTeX support of pastors' and priests' work"
DESCRIPTION = "In 'Die TeXnische Komodie' (issue 1/2013) Christian Justen \
described his use of LaTeX in his work as priest (similar \
requirements may be encountered in the work of pastors and \
other ministers of religion). One point was to arrange A5 pages \
onto A4 landscape paper, either side-by-side or as a booklet. \
Justen made two bash scripts for this job; the package provides \
one texlua script for both requirements. (Note that file \
a5toa4.tlu should have execute permissions in any \
installation.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.r37svn68950"

RPM_NAME = "texlive-pfarrei-2026.226.r37svn68950-58.2.noarch.rpm"
RPM_HASH = "56759024626dd0394a16abc855d024b2577d68cabe7240824119335c6d5dfdccb5d89e47b89f0e356f3327f44b461b6b76e663a8579c4d52e315f6410bd22718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a5toa4.tex \
tex-pfarrei.sty \
texlive-pfarrei"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-keyval.sty \
tex-pdfpages.sty \
tex-x.tex \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pfarrei-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
