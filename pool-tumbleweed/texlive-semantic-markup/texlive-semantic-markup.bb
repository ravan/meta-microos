SUMMARY = "Meaningful semantic markup in the spirit of the Text Encoding Initiative"
DESCRIPTION = "The package provides simple commands to allow authors \
(especially scholars in the humanities) to write with a focus \
on content rather than presentation. The commands are inspired \
by the XML elements of the Text Encoding Initiative. Commands \
like \\term and \\foreign are aliases for \\emph. \\quoted and \
\\soCalled are aliases for quoting commands. These commands \
could be easily redefined for different formats. The package \
also provides a footnote environment so that long footnotes can \
be more cleanly separated from the main text. Because the \
author is a music scholar, the package also includes some \
macros for musical symbols and other basic notations for \
musical analysis."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn53607"

RPM_NAME = "texlive-semantic-markup-2026.226.svn53607-60.2.noarch.rpm"
RPM_HASH = "8a7f7e0391aeee487300c978d36ce3f3c07b0d6af75e6c514635917b7cdd82d2b1d0227dd8425c12537d51d4b6b731d14d3f7cd10b72949d6ae373694d1776ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semantic-markup.sty \
texlive-semantic-markup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csquotes.sty \
tex-endnotes.sty \
tex-environ.sty \
tex-stackengine.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
