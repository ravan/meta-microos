SUMMARY = "List and text extensions"
DESCRIPTION = "The hep-text package extends LaTeX lists using the enumitem \
package and provides some text macros. The package is loaded \
with \\usepackage{hep-text}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-text-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "326f38f153e10c9ed4247aa304942aa6d4f90e8de6f50a075f02805afd283c528708cc899345c61df52a2551c20ac86270d6221e1619f92b1b7c6565ce729281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-text.sty \
texlive-hep-text"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-foreign.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-relsize.sty \
tex-soul.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
