SUMMARY = "A Visual LaTeX FAQ"
DESCRIPTION = "Having trouble finding the answer to a LaTeX question? The \
Visual LaTeX FAQ is an innovative new search interface that \
presents over a hundred typeset samples of frequently requested \
document formatting. Simply click on a hyperlinked piece of \
text and the Visual LaTeX FAQ will send your Web browser to the \
appropriate page in the TeX FAQ."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn61719"

RPM_NAME = "texlive-visualfaq-2026.226.svn61719-60.2.noarch.rpm"
RPM_HASH = "05ccfea1b27e9fd40ef23df467bcf44ace1b6daaede0f04519c18485ad22d111836232fcd3c5ab98afdbfa202362742a149fbdbebe800f93cbd637e59d037f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualfaq"

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
