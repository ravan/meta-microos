SUMMARY = "Automatic cover page creation for scientific papers"
DESCRIPTION = "The package CoverPage was created to supplement scientific \
papers with a cover page containing bibliographical \
information, a copyright notice, and/or some logos of the \
author's institution. The cover page is created (almost) \
automatically; this is done by parsing BibTeX information \
corresponding to the main document and reading a configuration \
file in which the author can set information like the \
affiliation he or she is associated with. The cover page \
consists of header, body and footer; all three are macros which \
can be redefined using \\renewcommand, thus allowing easy \
customization of the package. Additionally, it should be \
stressed that the cover page layout is totally independent of \
the main document and its page layout. This package requires \
four other packages (keyval, url, textcomp, and verbatim), but \
all of them are standard packages and should be part of every \
LaTeX installation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn63509"

RPM_NAME = "texlive-coverpage-2026.226.1.01svn63509-61.2.noarch.rpm"
RPM_HASH = "69ca56a25e51dd8ea9112330205d8fe5ab29f555eade25ba04a2b014aa897733a9be9052d5a585ef280ce6cf9cec2c959f29a0f654c976ad9922eaa58b10ee4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CoverPage.cfg \
tex-CoverPage.sty \
texlive-coverpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-textcomp.sty \
tex-url.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
