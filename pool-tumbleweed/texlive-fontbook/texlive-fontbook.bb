SUMMARY = "Generate a font book"
DESCRIPTION = "The package provides a means of producing a 'book' of font \
samples (for evaluation, etc.)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn23608"

RPM_NAME = "texlive-fontbook-2026.226.0.0.2svn23608-60.2.noarch.rpm"
RPM_HASH = "d60f7439a00c69eec75e20ad36a3253703fd8667be6fafda1b371bda897098e7e817c30c2f689e4c3c79d7c5f7e1b61a4f6d0ba1026b0d28055876855ef34739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontbook.sty \
texlive-fontbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
