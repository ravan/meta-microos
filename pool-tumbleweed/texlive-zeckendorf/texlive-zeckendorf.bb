SUMMARY = "Knuth Fibonacci multiplication, Zeckendorf and Bergman representations of big integers"
DESCRIPTION = "This package extends the \\xinteval syntax to do algebra in \
Q(phi) (where phi is the golden ratio), and compute Fibonacci \
numbers, Zeckendorf representations of positive integers and \
Bergman phi-representations of the positive elements of Z[phi]. \
The $ character is used to compute the Knuth Fibonacci \
multiplication. The package can be used either in a LaTeX \
document, or with Plain eTeX, or on the command line in an \
interactive session using eTeX. Being based upon xintexpr, it \
allows to compute with 'arbitrarily' big integers, the \
reasonable use being with integers of at most a few hundreds of \
digits."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9dsvn77682"

RPM_NAME = "texlive-zeckendorf-2026.226.0.0.9dsvn77682-59.4.noarch.rpm"
RPM_HASH = "512927c84576670f91b2a57329f1bbff62533ec4e1ac7cc811369c2a995cdea0948860d40b55d24985ba06919cd9a174b8cd123940fd6d867b7679ff4e9a6585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zeckendorf.sty \
tex-zeckendorf.tex \
tex-zeckendorfcore.tex \
texlive-zeckendorf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xintbinhex.sty \
tex-xintexpr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
