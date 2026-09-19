SUMMARY = "Extract and update marks from boxes"
DESCRIPTION = "This package can help you update marks if you put your title in \
boxes. You can use \
\\usepackage[minipage,multicol,tcolorbox]{updatemarks} in the \
preamble of your document so that marks in these environments \
can be found by LaTeX. You can use \\ExtractMarks or \
\\ExtractSplitMarks to save marks, and \\UpdateMarks to reinsert \
them."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn76924"

RPM_NAME = "texlive-updatemarks-2026.226.0.0.4asvn76924-60.2.noarch.rpm"
RPM_HASH = "df7c267dae70a10baa2e9f9ae4d6c6ad464182874dd8ef64584bc575a37bf2e31fe94bb14c907ea90d891b31446badbbc7fc6b30998d4fde2876c718925e9646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-updatemarks-nums.sty \
tex-updatemarks.sty \
texlive-updatemarks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
