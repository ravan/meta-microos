SUMMARY = "Specify version and compression level of output PDF files"
DESCRIPTION = "This package enables users to specify in their sources the \
following settings on the PDF document to output: PDF version \
(1.4, 1.5 etc.); whether or not to compress streams; whether or \
not to use object streams. This package supports all major \
PDF-output engines and dvipdfmx."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8asvn74105"

RPM_NAME = "texlive-bxpdfver-2026.226.0.0.8asvn74105-59.2.noarch.rpm"
RPM_HASH = "c98bdb20234de3b62ddc38af04ac5a3ca09a0ceb446eb21044afd0bef795c9a4d2e00d6faf47fa6651994afb7c43b965c64f299d930e7f5a9223d287c1c0846e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxpdfver.sty \
texlive-bxpdfver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
