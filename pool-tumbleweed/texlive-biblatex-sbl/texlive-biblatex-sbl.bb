SUMMARY = "Society of Biblical Literature (SBL) style files for BibLaTeX"
DESCRIPTION = "The package provides BibLaTeX support for citations in the \
format specified by the second edition of the Society of \
Biblical Literature (SBL) Handbook of Style. All example notes \
and bibliography entries from the handbook are supported and \
shown in an example file. A style file for writing SBL student \
papers is also included."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15svn71470"

RPM_NAME = "texlive-biblatex-sbl-2026.226.0.0.15svn71470-61.2.noarch.rpm"
RPM_HASH = "c94b378900c8543940963338404a51ef0800875c88324848668cdca17f622cbbcfb1a37a40230ef13e56e661bbb5e9319e4d158c10c388a4f067d9c0417f0044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-sbl.lbx \
tex-biblatex-sbl.def \
tex-english-sbl.lbx \
tex-german-sbl.lbx \
tex-sbl-paper.sty \
tex-sbl.bbx \
tex-sbl.cbx \
tex-spanish-sbl.lbx \
texlive-biblatex-sbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-american.lbx \
tex-biblatex.sty \
tex-bibleref-parse.sty \
tex-fancyhdr.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-imakeidx.sty \
tex-setspace.sty \
tex-standard.bbx \
tex-textcase.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
