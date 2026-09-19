SUMMARY = "Directly compile \\include'd child documents"
DESCRIPTION = "This LaTeX2e package enables the direct compilation of document \
sections included by \\include to individual files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn74758"

RPM_NAME = "texlive-childdoc-2026.226.2.0.1svn74758-60.2.noarch.rpm"
RPM_HASH = "a3f860ad2aa01e313296985526bfb45274ce8046512310a415f0ad1d2532d943e4521dc5ba085b7bd0183d673d73db0ca9b270e9bda796c929fc4183ed949e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-childdoc.def \
texlive-childdoc"

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
