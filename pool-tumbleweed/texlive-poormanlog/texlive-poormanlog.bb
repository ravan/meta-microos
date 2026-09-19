SUMMARY = "Logarithms and powers with (almost) 9 digits"
DESCRIPTION = "This small package (usable with Plain e-TeX, LaTeX, or others) \
with no dependencies provides two fast expandable macros \
computing logarithms in base 10 and fractional powers of 10. \
They handle arguments of 9 digit tokens which stand for either \
1 <= d.dddddddd < 10 (for the log) or 0.xxxxxxxxx (for powers \
of 10). They achieve a precision of 1ulp for the logarithm and \
2ulp for fractional powers of ten. Extension to other numerical \
ranges has to be done by user, via own macros or some math \
engine. The xintexpr package (at 1.3f) imports the poormanlog \
macros as core constituents of its log10(), pow10(), log(), \
exp() and pow() functions."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-poormanlog-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "3a4ddcb3b9b0311c303a21f4d93c1c79e71b0ab1c2ea185d538fe4fb05ab2d5342942be96ebabf168e24c839dbb469680997c7230fa6a6a11c8f2b1a8def81e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poormanlog.sty \
tex-poormanlog.tex \
texlive-poormanlog"

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
