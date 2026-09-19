SUMMARY = "Simulating word processor layout"
DESCRIPTION = "The package simulates typical word processor layout: narrow \
page margins, Times, Helvetica and Courier fonts, \\LARGE or \
\\Large headings, and \\sloppy typesetting. The package aims at \
making life easier for users who are discontent with LaTeX's \
standard layout settings because they need a layout that \
resembles the usual 'wordlike' output. The design of the \
package draws on several discussions in the de.comp.text.tex \
and comp.text.tex newsgroups that are referred to in the \
manual."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn15878"

RPM_NAME = "texlive-wordlike-2026.226.1.2bsvn15878-60.2.noarch.rpm"
RPM_HASH = "b8d6a06334a6c5a3b691f8a336046f7cc4fec345940120278c0f62193a25cf5270b36bc8f1bf5753283014432c63c1d2d9b67c076c4fd2093d4c49417ee7b588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wordlike.sty \
texlive-wordlike"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-courier.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-mathptmx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
