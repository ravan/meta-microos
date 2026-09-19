SUMMARY = "Embed MetaPost figures within LaTeX documents"
DESCRIPTION = "This LaTeX2e package enables the embedding of MetaPost figures \
within LaTeX documents. The package automatically collects the \
embedded definitions and figures in a .mp file, adds an \
appropriate LaTeX document structure, and compiles it to .mps \
files. It also allows for various configuration options to \
manage the generation of files and compilation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.3svn77187"

RPM_NAME = "texlive-mpostinl-2026.226.1.5.3svn77187-61.2.noarch.rpm"
RPM_HASH = "93a788000fcd09d4b035f6e4043edf09de3d4f67382710366de43d85960d143d9973a1ff3e46bfe583563c8d6faf3e69fa13d67acb90f0b6fa1ca075a28089ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpostinl.sty \
texlive-mpostinl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
tex-shellesc.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
