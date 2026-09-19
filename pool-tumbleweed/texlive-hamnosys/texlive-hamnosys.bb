SUMMARY = "A font for sign languages"
DESCRIPTION = "The Hamburg Notation System, HamNoSys for short, is a system \
for the phonetic transcription of signed languages. This \
package makes HamNoSys available in XeLaTeX and LuaLaTeX. The \
package provides a Unicode font for rendering HamNoSys symbols \
as well as three methods for entering them."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-2026.226.1.0.3svn61941-60.4.noarch.rpm"
RPM_HASH = "a40933679e07cec79fffd9894d447f8a3882ca4e1b82fd39b61b19c8da21dd913b8d5a05bee4f437a3f41afa920d89e2cb1b195009da3594ec70346f7127332e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hamnosys.sty \
texlive-hamnosys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-ucharclasses.sty \
texlive \
texlive-filesystem \
texlive-hamnosys-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
