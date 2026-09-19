SUMMARY = "A computer algebra system for users of LuaLaTeX"
DESCRIPTION = "This package provides a portable computer algebra system \
capable of symbolic computation, written entirely in Lua, \
designed for use in LuaLaTeX. Features include: \
arbitrary-precision integer and rational arithmetic, factoring \
of univariate polynomials over the rationals and finite fields, \
number theoretic algorithms, symbolic differentiation and \
integration, and more. The target audience for this package are \
mathematics students, instructors, and professionals who would \
like some ability to perform basic symbolic computations within \
LaTeX without the need for laborious and technical setup."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn67247"

RPM_NAME = "texlive-luacas-2026.226.1.0.2svn67247-59.2.noarch.rpm"
RPM_HASH = "69f31678435998a82598718399e3f0ca43b4bb8c54337113bab3f5ff7d8c8b503fc54d625c3f0ff7b76884df285ebed06d171799076c8772604171d3d76ff17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacas.sty \
texlive-luacas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luacode.sty \
tex-mathtools.sty \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
