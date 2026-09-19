SUMMARY = "Put a grey textual watermark on document pages"
DESCRIPTION = "The package provides a means to add a watermark (typically a \
light gray piece of text) on every page or on the first page of \
a document. Typical usage may consist in writing words such as \
DRAFT or CONFIDENTIAL across document pages. The package \
performs a similar function to that of draftcopy, but its \
implementation is output device independent. As of December \
2020, the package relies on the new shipout hooks directly \
provided by LaTeX. For users of older versions of LaTeX, the \
package also provides a legacy version of itself (that is \
automatically loaded, currently being at release 2.3) which \
relies on the everypage package. Note that this legacy version \
will progressively lag behind in terms of features."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn77682"

RPM_NAME = "texlive-draftwatermark-2026.226.3.3svn77682-59.2.noarch.rpm"
RPM_HASH = "baa1c07797b3a873f85e01cb2c9f4ea60c737bc9724a08302af703dc642e9a6fecfad51e4d11ec05be3fc53d33698b3802b552fa7107701bfa0b8eaf82973260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-draftwatermark-2x.sty \
tex-draftwatermark.sty \
texlive-draftwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-everypage.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
