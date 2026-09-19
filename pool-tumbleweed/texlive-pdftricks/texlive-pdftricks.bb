SUMMARY = "Support for PSTricks in pdfTeX"
DESCRIPTION = "The PSTricks macros cannot be used (directly) with pdfTeX, \
since PSTricks uses PostScript arithmetic, which isn't part of \
PDF. This package circumvents this limitation so that the \
extensive facilities offered by the powerful PSTricks package \
can be made use of in a pdfTeX document. This is done using the \
shell escape function available in current TeX implementations. \
The package may also be used in support of other \
'PostScript-output-only' packages, such as PSfrag. For \
alternatives, users may care to review the discussion in the \
PSTricks online documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.16svn15878"

RPM_NAME = "texlive-pdftricks-2026.226.1.16svn15878-58.2.noarch.rpm"
RPM_HASH = "4e498a643da3719cb83b7ee1f022e496e4186d1d2e9ad5cf7f3abca69f067853f815d73b57e2c30da55114633e27d4493a2b657e1706db8dbc4c76268fe1d09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdftricks.sty \
texlive-pdftricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
