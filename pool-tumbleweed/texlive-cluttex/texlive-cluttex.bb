SUMMARY = "An automation tool for running LaTeX"
DESCRIPTION = "This is another tool for the automation of LaTeX document \
processing, like latexmk or arara. The main feature of this \
tool is that it does not clutter your working directory with \
.aux or .log or other auxiliary files. It has of course the \
usual features of automation tools: It automatically re-runs \
(La)TeX for cross-references. MakeIndex, BibTeX, Biber, or \
makeglossaries will be executed if a corresponding option is \
set. Furthermore, cluttex can watch input files for changes \
(using an external program)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7.0svn74655"

RPM_NAME = "texlive-cluttex-2026.226.0.0.7.0svn74655-60.2.noarch.rpm"
RPM_HASH = "3f61818c7e30743a47c231a6ddeb22ca3a38787f67497797a8278c4ba572a3408f4eb35bd8dde2abf7f362e37a2590a91324814120473e8e06199c2d77b79cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cluttex"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cluttex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
