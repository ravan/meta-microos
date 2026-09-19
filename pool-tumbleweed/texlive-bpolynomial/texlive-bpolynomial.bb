SUMMARY = "Drawing polynomial functions of up to order 3"
DESCRIPTION = "This MetaPost package helps plotting polynomial and root \
functions up to order three. The package provides macros to \
calculate Bezier curves exactly matching a given constant, \
linear, quadratic or cubic polynomial, or square or cubic root \
function. In addition, tangents on all functions and \
derivatives of polynomials can be calculated."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-bpolynomial-2026.226.0.0.5svn15878-59.2.noarch.rpm"
RPM_HASH = "0402a9ceb69dcf928fbc180b6c28ab337264d81cae1a79db15fbea6fe2bb3686604996bbe07ffbf9875a4915f96efd92541bc5211f06eb2cb4e3c9a3329d3c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpolynomial"

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
