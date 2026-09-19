SUMMARY = "Macros for 'Progress of Theoretical Physics'"
DESCRIPTION = "The distribution contains the class (which offers an option \
file for preprints), and a template. The class requires the \
cite, overcite and wrapfig packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-2026.226.0.0.91svn19440-60.4.noarch.rpm"
RPM_HASH = "9e818a2e100e47759140ac435d437ac4111d17f2753bf934c858f3e048e45cc014ebd96a134aee630ed1f3f5b243359942a85e42cf1c0b1d3eb38179a8e79ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptp-prep.clo \
tex-ptptex.cls \
tex-wrapft.sty \
texlive-ptptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-overcite.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
