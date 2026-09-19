SUMMARY = "Class for ACM conference proceedings"
DESCRIPTION = "This class may be used to typeset articles to be published in \
the proceedings of ACM (Association for Computing Machinery) \
conferences and workshops. The layout produced by the acmconf \
class is based on the ACM's own specification."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn15878"

RPM_NAME = "texlive-acmconf-2026.226.1.3svn15878-61.2.noarch.rpm"
RPM_HASH = "2c8f84341abe1513eec49201a8e2a9ebd41c06c65da2838f12b55e3c8a0e905d7400dd3b3902e08304038b0a45cf8ad582a1f8b036ffec7aebdfb17120131594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acmconf.cls \
texlive-acmconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-flushend.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
