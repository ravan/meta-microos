SUMMARY = "Control the behaviour of '_' in text"
DESCRIPTION = "With the package, \\_ in text mode (i.e., \\textunderscore) \
prints an underscore so that hyphenation of words either side \
of it is not affected; a package option controls whether an \
actual hyphenation point appears after the underscore, or \
merely a break point. The package also arranges that, while in \
text, '_' itself behaves as \\textunderscore (the behaviour of _ \
in maths mode is not affected)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-underscore-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "ffceaed544c279fe4f9b8fe922c1c49cb8d7505919dc80d687b7cd95675698274640582fe57ebf73d61e6a3529a52f13106da718b1c02ad76ecf67e658eaebb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-underscore.sty \
texlive-underscore"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chicago.sty \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
