SUMMARY = "Syntax-Highlighting of program code"
DESCRIPTION = "The package is based on pygmentex but provides an automatic run \
from within the document itself, with the option \
--shell-escape. It does not need the additional action by the \
user to run the external program pygmentize to create the code \
snippets."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-2026.226.0.0.01svn62405-60.2.noarch.rpm"
RPM_HASH = "5b6b36005ed333d22a18a5ca1dd1ffaffe533f9a84e6a14f066291585c8fe660eeb2d62d308c0447b1b7cdd6c3e2f4dafe4336cc9619104cef6e99dd97faa324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvpygmentex.sty \
texlive-hvpygmentex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-color.sty \
tex-efbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-mdframed.sty \
tex-pgfkeys.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
