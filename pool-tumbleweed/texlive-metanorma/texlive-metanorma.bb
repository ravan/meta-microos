SUMMARY = "Write Metanorma standardization documents using LaTe"
DESCRIPTION = "metanorma This work includes a LaTeX document class, a \
`latexml` script and a `latexmlpost` stylesheet which allow you \
to write a LaTeX document and transcode it into Metanorma's \
`ADOC` format. This work is sponsored by Ribose Inc. \
(<https://www.ribose.com>). This work is maintained by Ribose \
Inc. (<open.source@ribose.com>)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn55010"

RPM_NAME = "texlive-metanorma-2026.226.0.0.5.0svn55010-61.2.noarch.rpm"
RPM_HASH = "4346e5c1458dee991a69d77b1c0e0cebbc33cbf333eb491eb9e53ee39840e1b48fbb22a0ae7999e144220bd4e710a2416547aca51e480db4bc0a28757cbb4617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metanorma.cls \
texlive-metanorma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-enumitem.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-mdframed.sty \
tex-subcaption.sty \
tex-ulem.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
