SUMMARY = "Environments for writing optimization problems"
DESCRIPTION = "This small library provides a standard set of environments for \
writing optimization problems. It automatically aligns the \
problems in three points with an optional fourth: Beginning of \
the words 'minimize/argmin' and 'subject to' The objective \
function and the longest left hand side of the constraints. The \
$= | > | <$ signs of the constraints. Optionally, the user can \
add manually a double align character && to align some common \
constraints feature. A clear example could be the constraints \
names, e.g. (boundary constraint) alignment with (dynamic \
constraint). Furthermore, it provides an easy interface to \
define optimization problem for three different reference \
situations: Where no equation is referenced/numbered. Where the \
problem is referenced with a single number. Where each equation \
has an individual reference. Finally, it also allows a \
definition of any optimization problem without a limitless \
number of constraints."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn50941"

RPM_NAME = "texlive-optidef-2026.226.3.1svn50941-61.2.noarch.rpm"
RPM_HASH = "dbd0f4b2fae4af9ed0223d3d47b62b30b6167b9409a56cc1fb9067481fe9b6924f370cb9d5d134db76ce9c29fb8c8cd415543b0b2a6f95a742b5393ebdffc9be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-optidef.sty \
texlive-optidef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
