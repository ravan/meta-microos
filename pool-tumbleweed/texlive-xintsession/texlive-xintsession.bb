SUMMARY = "Interactive computing sessions (fractions, floating points, polynomials)"
DESCRIPTION = "This package provides support for interactive computing \
sessions with etex (or pdftex) executed on the command line, on \
the basis of the xintexpr and polexpr packages. Once \
xintsession is loaded, eTeX becomes an interactive computing \
software capable of executing arbitrary precision calculations, \
or exact calculations with arbitrarily big fractions. It can \
also manipulate polynomials as algebraic entities. Numerical \
variables and functions can be defined during the session, and \
each evaluation result is stored in automatically labeled \
variables. A file is automatically created storing inputs and \
outputs."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-2026.226.0.0.4alphasvn60926-59.4.noarch.rpm"
RPM_HASH = "addc5721051cec2b4faa5649c664c61f3731a4cdfa9366ab70e307c438a8b0d8bd5be60a8b2eeccdecda2e4038558f08843b191ab44c1d1426d07df5b14271f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xintsession.tex \
texlive-xintsession"

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
