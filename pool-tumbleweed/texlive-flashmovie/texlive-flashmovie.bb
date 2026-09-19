SUMMARY = "Directly embed flash movies into PDF files"
DESCRIPTION = "The package allows direct embedding of flash movies into PDF \
files. It is designed for use with pdfLaTeX. The package takes \
advantage of the embedded Adobe Flash player in Adobe Reader 9; \
the reader is invoked with the 'rich media annotation' feature, \
described in 'Adobe Supplement to the ISO 32000 BaseVersion: \
1.7 ExtensionLevel: 3'. This method of embedding movies is \
attractive since it removes all platform dependencies; however, \
the user is required to use Acrobat 9."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn25768"

RPM_NAME = "texlive-flashmovie-2026.226.0.0.4svn25768-59.2.noarch.rpm"
RPM_HASH = "3e10306d364d2ac99a830f79a87babcf1b5802dae9af424ebba248360b07a486330ea78d0af30a70f83ad0638a592e40aecc52c504fe0b45a39809d2a17bdc36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flashmovie.sty \
texlive-flashmovie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
