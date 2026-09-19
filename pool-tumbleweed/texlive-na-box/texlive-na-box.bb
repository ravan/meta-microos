SUMMARY = "Arabic-aware version of pas-cours package"
DESCRIPTION = "This is a modified version of the pas-cours package made \
compatible with XeLaTeX/polyglossia to write arabic documents \
with fancy boxed theorem-alike environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn45130"

RPM_NAME = "texlive-na-box-2026.226.1.0svn45130-61.2.noarch.rpm"
RPM_HASH = "4c5ca1d6c7e8083f8c14e436f9cb30e7a0c853bbeebd9ae5e12d63bc952889a2557a48839a0f1a7c0428647af0142c7e63891067310f6a55a93f8aac2acca4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-na-box.sty \
texlive-na-box"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-enumitem.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
