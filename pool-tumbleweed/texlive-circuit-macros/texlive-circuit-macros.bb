SUMMARY = "M4 macros for electric circuit diagrams"
DESCRIPTION = "A set of m4 macros for drawing high-quality electric circuits \
containing fundamental elements, amplifiers, transistors, and \
basic logic gates to include in TeX, LaTeX, or similar \
documents. Some tools and examples for other types of diagrams \
are also included. The macros can be evaluated to drawing \
commands in the pic language, which is very easy to understand \
and which has a good power/complexity ratio. Pic contains \
elements of a simple programming language, and is well-suited \
to line drawings requiring parametric or conditional \
components, fine tuning, significant geometric calculations or \
repetition, or that are naturally block structured or tree \
structured. (The m4 and pic processors are readily available \
for Unix and PC machines.) Alternative output macros can create \
TeX output to be read by pstricks, TikZ commands for use by the \
pgf bundle, or SVG."
LICENSE = "LPPL-1.0"

PV = "2026.226.10.9svn76218"

RPM_NAME = "texlive-circuit-macros-2026.226.10.9svn76218-60.2.noarch.rpm"
RPM_HASH = "201dcaa34e5b1a2ac4fdb17412db31af90c7a12c763834d98d304d07d39526bf2eb1b607a04814c421f1198556242f640ed4055e803c93c827c07f02412c3911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boxdims.sty \
texlive-circuit-macros"

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
