SUMMARY = "Macros for use in the author's documentation"
DESCRIPTION = "The package is not advertised for public use, but is necessary \
for the support of others of the author's packages (which are \
compiled under the ltxdoc class)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24500"

RPM_NAME = "texlive-fcltxdoc-2026.226.1.0svn24500-59.2.noarch.rpm"
RPM_HASH = "ac1cabe62233f29477ac20d1aea44cb005ad1d7082f27c15071be50db6a6a2245f31987b0d12fcb97171de7cb4bc841af64b8ae6badf5be84476ba92e3f06f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fcltxdoc.sty \
texlive-fcltxdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amsopn.sty \
tex-amssymb.sty \
tex-array.sty \
tex-bbding.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-delarray.sty \
tex-embedfile.sty \
tex-enumitem.sty \
tex-etexcmds.sty \
tex-etoolbox.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-filehook.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-grffile.sty \
tex-hologo.sty \
tex-hypbmsec.sty \
tex-hypdoc.sty \
tex-hyperref.sty \
tex-interfaces.sty \
tex-lastpage.sty \
tex-linegoal.sty \
tex-listings.sty \
tex-ltxcmds.sty \
tex-ltxnew.sty \
tex-makecell.sty \
tex-manfnt.sty \
tex-marginnote.sty \
tex-moresize.sty \
tex-nccfoots.sty \
tex-nccstretch.sty \
tex-needspace.sty \
tex-pdftexcmds.sty \
tex-relsize.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
