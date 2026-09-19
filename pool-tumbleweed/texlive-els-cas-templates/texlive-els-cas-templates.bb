SUMMARY = "Elsevier updated LaTeX templates"
DESCRIPTION = "This bundle provides two class and corresponding template files \
for typesetting journal articles supposed to go through \
Elsevier's updated workflow. One of the sets is meant for \
one-column, the other for two-column layout. These are now \
accepted for submitting articles both in Elsevier's electronic \
submission system and elsewhere."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn71189"

RPM_NAME = "texlive-els-cas-templates-2026.226.2.4svn71189-61.4.noarch.rpm"
RPM_HASH = "e6cad6f2e42505328b1374e6943aa29d4591fae96c91b6b97924b61ef20abf1148f53c0aceb91bcc7583096061726a43958d4da6de6b47ee0a71236a249f886d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cas-common.sty \
tex-cas-dc.cls \
tex-cas-sc.cls \
texlive-els-cas-templates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-balance.sty \
tex-booktabs.sty \
tex-colortbl.sty \
tex-dcolumn.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inconsolata.sty \
tex-makecell.sty \
tex-moreverb.sty \
tex-multirow.sty \
tex-setspace.sty \
tex-stfloats.sty \
tex-stix.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
