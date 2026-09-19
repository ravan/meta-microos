SUMMARY = "Bind fonts to specific unicode blocks"
DESCRIPTION = "The package (which runs under XeLaTeX) lets you bind fonts to \
specific unicode blocks, for automatic font tagging of \
multilingual text. The package uses Perl (via perltex) to \
construct its tables."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-fontwrap-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "dce64aada753da611c3c0743dd0d91ae83c2bcfe04b2550c7fa1bbd146df7087f67c6f80d29fa969ae85f4f4defd5ffb8ec705492138038a20deb0ace96606a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontwrap.sty \
texlive-fontwrap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-perltex.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
