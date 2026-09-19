SUMMARY = "Compute params to fit conditions"
DESCRIPTION = "Sometimes one wants to compute font size or letter spacing so \
that text fits a desired length, or some unit length so that a \
picture fits some desired size, for instance. This package \
implements macros to compute such parameters to fit a \
condition."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77518"

RPM_NAME = "texlive-paramcalc-2026.226.1.0svn77518-58.2.noarch.rpm"
RPM_HASH = "bc04120ee6341f602823c934a662ccac63432bc6fadbd9bf5cab06ca6cf15c92bcc2dee7c440adcf485f6bc29ee916827c626f6f4354583bde5773c775529b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paramcalc.sty \
texlive-paramcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
