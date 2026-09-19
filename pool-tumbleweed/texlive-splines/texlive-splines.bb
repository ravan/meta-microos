SUMMARY = "MetaPost macros for drawing cubic spline interpolants"
DESCRIPTION = "This is a small package of macros for creating cubic spline \
interpolants in MetaPost or Metafont. Given a list of points \
the macros can produce a closed or a relaxed spline joining \
them. Given a list of function values y_j at x_j, the result \
would define the graph of a cubic spline interpolating function \
y=f(x), which is either periodic or relaxed."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-splines-2026.226.0.0.2svn15878-64.2.noarch.rpm"
RPM_HASH = "5677253277d2dea45e40a2f929b22bf3988511ec427cb3f6514f44fd602e193cdb92ef004d1b9956cc1e900c50cb5f848fcf5d6d22d866930fe1eccddee90c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splines"

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
