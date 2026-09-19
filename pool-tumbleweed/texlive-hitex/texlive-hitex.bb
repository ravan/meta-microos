SUMMARY = "A TeX extension writing HINT output for on-screen reading"
DESCRIPTION = "An extension of TeX which generates HINT output. The HINT file \
format is an alternative to the DVI and PDF formats which was \
designed specifically for on-screen reading of documents. \
Especially on mobile devices, reading DVI or PDF documents can \
be cumbersome. Mobile devices are available in a large variety \
of sizes but typically are not large enough to display \
documents formated for a4/letter-size paper. To compensate for \
the limitations of a small screen, users are used to \
alternating between landscape (few long lines) and portrait \
(more short lines) mode. The HINT format supports variable and \
varying screen sizes, leveraging the ability of TeX to format a \
document for nearly-arbitrary values of \\hsize and \\vsize."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-hitex-2026.226.svn77830-60.4.noarch.rpm"
RPM_HASH = "37c67846789022eb3c76d52d0a1dcab057fca0da69a5d80416653f556cb96da07a1fb356b72ce9d3bbeb7abf98f499c15bd1a390e6ece8391b495dfb32f373ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hhitex.def \
tex-hiltxpage.tex \
tex-hiplainpage.tex \
tex-ifhint.tex \
texlive-hitex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hitex-bin \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
