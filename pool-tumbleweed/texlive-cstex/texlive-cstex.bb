SUMMARY = "Support for Czech/Slovak languages"
DESCRIPTION = "This package mirrors the macros part of the home site's \
distribution of CSTeX. The licence (modified GPL) applies to \
some of the additions that make it a Czech/Slovak language \
distribution, rather than the distribution of a basic \
Plain/LaTeX distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn64149"

RPM_NAME = "texlive-cstex-2026.226.svn64149-61.2.noarch.rpm"
RPM_HASH = "9f15d85dd9b8217e95897817c6608159c43d0367f0d590d22f1530e0781e6f022d3cb8f9c5af0d538ebbc8c629ec73af9ea77b72ed5c34a224e8b3496e8bb55f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cstex"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
