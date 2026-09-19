SUMMARY = "Class and templates for typesetting dissertations in Russian"
DESCRIPTION = "Disser comprises a document class and set of templates for \
typesetting dissertations in Russian. One of its primary \
advantages is a simplicity of format specification for \
titlepage, headers and elements of automatically generated \
lists (table of contents, list of figures, etc). Bibliography \
styles, that conform to the requirements of the Russian \
standard GOST R 7.0.11-2011, are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.0svn43417"

RPM_NAME = "texlive-disser-2026.226.1.5.0svn43417-59.2.noarch.rpm"
RPM_HASH = "216225bcb1e85e93f676383ef9e7857f68471207c8220fb824a84e79a6bcf47c72b2e39b3d38394c8debf8396ecbb45a8d279651846b2d953fb34d04c8292482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autoref.rtx \
tex-bachelor.rtx \
tex-candidate.rtx \
tex-disser.cls \
tex-doctor.rtx \
tex-gost732.cls \
tex-master.rtx \
tex-specialist.rtx \
tex-titledefs.rtx \
texlive-disser"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-cmap.sty \
tex-color.sty \
tex-exscale.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-natbib.sty \
tex-subcaption.sty \
tex-textcase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
