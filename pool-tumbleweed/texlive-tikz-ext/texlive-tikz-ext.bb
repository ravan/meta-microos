SUMMARY = "A collection of libraries for PGF/TikZ"
DESCRIPTION = "This is a collection of PGF and TikZ libraries which were \
developed in response to questions on tex.stackexchange.com or \
texwelt.de. These libraries can be loaded by either \
\\usepgflibrary or \\usetikzlibrary."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.0.0.6.2svn75014"

RPM_NAME = "texlive-tikz-ext-2026.226.0.0.6.2svn75014-59.2.noarch.rpm"
RPM_HASH = "e2b7603fd7397fee36e5097c8aea418025a69ad48a23203455a2f0d8d145ffc410868dbe13d2d5807d6fcef08378e419cc75477728ad93e57632dcc530cd989d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfcalendar-ext.code.tex \
tex-pgfcalendar-ext.sty \
tex-pgfcalendar-ext.tex \
tex-pgffor-ext.code.tex \
tex-pgffor-ext.sty \
tex-pgffor-ext.tex \
tex-pgfkeyslibraryext.pgfkeys-plus.code.tex \
tex-pgflibraryext.arrows.code.tex \
tex-pgflibraryext.shapes.circlearrow.code.tex \
tex-pgflibraryext.shapes.circlecrosssplit.code.tex \
tex-pgflibraryext.shapes.heatmark.code.tex \
tex-pgflibraryext.shapes.rectangleroundedcorners.code.tex \
tex-pgflibraryext.shapes.superellipse.code.tex \
tex-pgflibraryext.shapes.uncenteredrectangle.code.tex \
tex-pgflibraryext.transformations.mirror.code.tex \
tex-tikzext-util.tex \
tex-tikzlibraryext.arrows-plus.code.tex \
tex-tikzlibraryext.beamer.code.tex \
tex-tikzlibraryext.calendar-plus.code.tex \
tex-tikzlibraryext.layers.code.tex \
tex-tikzlibraryext.misc.code.tex \
tex-tikzlibraryext.node-families.code.tex \
tex-tikzlibraryext.node-families.shapes.geometric.code.tex \
tex-tikzlibraryext.nodes.code.tex \
tex-tikzlibraryext.paths.arcto.code.tex \
tex-tikzlibraryext.paths.ortho.code.tex \
tex-tikzlibraryext.paths.timer.code.tex \
tex-tikzlibraryext.patterns.images.code.tex \
tex-tikzlibraryext.positioning-plus.code.tex \
tex-tikzlibraryext.scalepicture.code.tex \
tex-tikzlibraryext.shapes.uncenteredrectangle.code.tex \
tex-tikzlibraryext.topaths.arcthrough.code.tex \
tex-tikzlibraryext.topaths.autobend.code.tex \
tex-tikzlibraryext.transformations.mirror.code.tex \
texlive-tikz-ext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfcalendar.sty \
tex-pgffor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
