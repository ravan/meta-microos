SUMMARY = "Using expl3 to implement some numerical algorithms"
DESCRIPTION = "An article, in French, based on a presentation made in \
Dunkerque for the 'stage LaTeX' on 12 June 2019. The articles \
gives three examples of code in expl3 with (lots of) comments: \
Knuth's algorithm to create a list of primes, the sieve of \
Eratosthenes, Kaprekar sequences. The package contains the code \
itself, the documentation as a PDF file, and all the files \
needed to produce it."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-expose-expl3-dunkerque-2019-2026.226.1.2svn76924-59.2.noarch.rpm"
RPM_HASH = "17dffa26791ba34da134cbf31a88901170bf8358f8cb2b8c8d65261226b1f978193b5370357d621f17637d6c85dc0736425901e1e8ca1ebe735b76908ff516b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expose-expl3-dunkerque-2019"

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
