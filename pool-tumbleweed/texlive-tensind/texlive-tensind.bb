SUMMARY = "Typeset tensors"
DESCRIPTION = "Typesets tensors with dots filling gaps and fine tuning of \
index placement."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn77682"

RPM_NAME = "texlive-tensind-2026.227.1.1svn77682-62.2.noarch.rpm"
RPM_HASH = "ace240896681dd5bdaa840f167dc6db153688b6cf032151b8233b5e576510c69de78d9192edc34af100dcf05ed3590a15e307f6aaef480886693f1cdf3cdbf58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tensind.sty \
texlive-tensind"

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
