SUMMARY = "Support for typesetting Catholic liturgical texts"
DESCRIPTION = "The packages offers simple macros for typesetting Catholic \
liturgical texts, particularly Missal and Breviary texts. The \
package assumes availability of Latin typesetting packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-liturg-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "cfab31398bf87a6453c653125f985cdb2842ee12e9dd2209f8b1bebed4335f2617d312a15b47a5b4d025083999c06d18d5b4950a10c3ca35627712bf5896c82c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-liturg.sty \
texlive-liturg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-color.sty \
tex-ecclesiastic.sty \
tex-lettrine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
