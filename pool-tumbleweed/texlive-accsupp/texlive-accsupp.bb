SUMMARY = "Better accessibility support for PDF files"
DESCRIPTION = "Since PDF 1.5 portions of a page can be marked for better \
accessibility support. For example, replacement texts or \
expansions of abbreviations can be provided. This package \
starts with providing a minimal low-level interface for \
programmers; its status is experimental. Support necessary for \
the package was added to the 'distill' capabilities of \
Ghostscript with version 9.15 of Ghostscript; the dvips is only \
available with that version (or later)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn53052"

RPM_NAME = "texlive-accsupp-2026.226.0.0.6svn53052-61.2.noarch.rpm"
RPM_HASH = "d237ffe9af52eaf7cbec8498e5f13699f00d8ed0fa8d1ea29e39ffa642d9ef30429c6f9b5c108975359cdf4514009b9f931a4aaeb2595df60af207fa8afa22e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accsupp-dvipdfm.def \
tex-accsupp-dvips.def \
tex-accsupp-luatex.def \
tex-accsupp-pdftex.def \
tex-accsupp.sty \
texlive-accsupp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-kvoptions.sty \
tex-pdfescape.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
