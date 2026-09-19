SUMMARY = "Repetition of theorem environments"
DESCRIPTION = "When writing a large manuscript, it is sometimes beneficial to \
repeat a theorem (or lemma or...) at an earlier or later point \
for didactical purposes. However, thmtools's built-in \
restatable only allows replicating theorems after they have \
been stated, and only in the same document. This package solves \
the issue by making use of the .aux file, and also introduces \
its own file extension, .thm, to replicate theorems in other \
files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.1svn76224"

RPM_NAME = "texlive-reptheorem-2026.226.1.4.1svn76224-60.4.noarch.rpm"
RPM_HASH = "4cff2fdb24abd9a4f57ae11839ddf4f231cba23afa910e4f14c98fc7de2a795a08bc014e0399e426fde45a751dc305833be3eb167d5da04deca3b482fb0d2732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reptheorem.sty \
texlive-reptheorem"

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
