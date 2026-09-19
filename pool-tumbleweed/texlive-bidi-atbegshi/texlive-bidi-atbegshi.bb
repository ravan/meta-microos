SUMMARY = "Bidi-aware shipout macros"
DESCRIPTION = "The package adds some commands to the atbegshi package for \
proper placement of background material in the left and right \
corners of the output page, in both LTR and RTL modes. The \
package only works with xelatex format and should be loaded \
before the bidi package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn62009"

RPM_NAME = "texlive-bidi-atbegshi-2026.226.0.0.2svn62009-61.2.noarch.rpm"
RPM_HASH = "a411d57adc5483b9f5c7a0cfdcffea58639b50e99e44d5329fc5e5cd20a9cb457858eaaf03c7d57a4c5e17c845db859d576e7aefa0504f8eedca11c723ed2b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidi-atbegshi.sty \
texlive-bidi-atbegshi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi-ltx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
