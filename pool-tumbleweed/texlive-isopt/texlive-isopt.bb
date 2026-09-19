SUMMARY = "Writing a TeX length with a space between number and unit"
DESCRIPTION = "Writing a TeX length with \\the writes the value and the unit \
without a space. Package isopt provides a macro \\ISO which \
inserts a user defined space between number and unit."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn45509"

RPM_NAME = "texlive-isopt-2026.226.0.0.01svn45509-63.2.noarch.rpm"
RPM_HASH = "a4f740d6989d0d9cdcb17ce5ab96035b45253b524e6def0ef658a026190ab0fd7bdc73391e4d25240c44696a70c05e5f1f92c012f0628bee1557bb0e32f09e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isopt.sty \
texlive-isopt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
