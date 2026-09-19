SUMMARY = "Expandable arbitrary precision floating point and integer operations"
DESCRIPTION = "Loading xintexpr provides \\xinteval and \\xintfloateval. \
\\xintfloateval evaluates numerical expressions. The floating \
point precision defaults to 16 decimal digits and can be set by \
user. Trigonometry, exponential and logarithms are implemented \
up to a maximal precision of 62 decimal digits. \\xinteval \
computes exactly with integers, fractions, and decimal numbers \
or numbers in scientific notation. Note though that multiplying \
two floating point numbers will about double the number of \
digits, and so on, because the algebra is done exactly. Both \
are compatible with expansion-only context. Loading xintexpr \
imports automatically various other modules that it depends \
upon. Among them: xinttools: utilities such as expandable and \
non-expandable loops, xint: macros implementing in particular \
the basic operations on arbitrarily long integers, xintbinhex: \
conversions between decimal and binary, octal, or hexadecimal \
bases for arbitrarily long integers, xintfrac: macros \
implementing in particular the basic operations on arbitrarily \
large fractions, decimal numbers, or numbers in scientific \
notation. Further modules of independent interest include \
xintgcd, xintseries and xintcfrac. You can use xintexpr (and \
the other components) with LaTeX (via \\usepackage) or also with \
Plain TeX, OpTeX, or ConTeXt (via \\input xintexpr.sty). All the \
components are documented in the file xint.pdf, which also \
contains the commented source code."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4osvn76255"

RPM_NAME = "texlive-xint-2026.226.1.4osvn76255-59.4.noarch.rpm"
RPM_HASH = "893086dfb19aa2908ac1104c7b7a62eb8d62a30e0cbc1d89dcb49ed75d5b1e964b212913aaeed6b842d730a9f3003771d1bb89f20a0a6044cda037a3c6444084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xint.sty \
tex-xintbinhex.sty \
tex-xintcfrac.sty \
tex-xintcore.sty \
tex-xintexpr.sty \
tex-xintfrac.sty \
tex-xintgcd.sty \
tex-xintkernel.sty \
tex-xintlog.sty \
tex-xintseries.sty \
tex-xinttools.sty \
tex-xinttrig.sty \
texlive-xint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-poormanlog.sty \
tex-poormanlog.tex \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
