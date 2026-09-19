SUMMARY = "Resize pictures while respecting text size"
DESCRIPTION = "The package extends the \\includegraphics command to support \
tikzpictures. It allows scaling of TikZ images and PGFPlots to \
a given width or height without changing the text size."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.6svn30637"

RPM_NAME = "texlive-tikzscale-2026.226.0.0.2.6svn30637-59.2.noarch.rpm"
RPM_HASH = "ab9cf958ae9df6cf1048742fa453a8bede7588a5b5cf4572f3d901531c30e832e2be310a78799b0c568d26ef2acb5986286cb1b244275dd988d64ce9b0f9bc48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzscale.sty \
texlive-tikzscale"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-letltxmacro.sty \
tex-pgfkeys.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
