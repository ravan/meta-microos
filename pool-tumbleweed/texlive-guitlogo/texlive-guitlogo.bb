SUMMARY = "Macros for typesetting the GuIT logo"
DESCRIPTION = "This package provides some commands useful to correctly write \
the logo of 'Gruppo Utilizzatori Italiani di TeX' (Italian TeX \
User Group), using the default document color or any other \
color the user may ever choose, in conformity with the logo's \
scheme as seen on the group's website https://www.guitex.org. \
Likewise, commands are provided that simplify the writing of \
the GuIT acronym's complete expansion, of the addresses of the \
group's internet site and public forum, and the meeting \
'GuITmeeting' and the magazine Ars TeXnica's logo. Optionally, \
using hyperref, the outputs of the above cited commands can \
become hyperlinks to the group's website \
https://www.guitex.org. The Documentation is available in \
Italian only."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-2026.226.1.0.0_alpha.4svn55741-60.4.noarch.rpm"
RPM_HASH = "2c58a559e7f28663f8eeba0803b3e340539c54b2e067cecfc9aca2a8dd4875e1bf8c7d6c94e9d74fbc0c7cfb83b7b4a204a6d70e7ac7a835a6607222c1d58388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guit.cfg \
tex-guit.sty \
texlive-guitlogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
