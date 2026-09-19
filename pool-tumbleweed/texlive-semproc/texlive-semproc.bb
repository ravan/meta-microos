SUMMARY = "Seminar proceedings"
DESCRIPTION = "The package provides functionality for typesetting seminar \
proceedings based on KOMA-Script's scrreprt class and etoc. It \
offers an alternative to \\chapter that typesets the speaker and \
if necessary the typist of the notes for the talk in question. \
Moreover, the class provides two types of table of contents. A \
global table of contents showing only the talks of the seminar \
and the respective speakers and a local table of contents for \
each talk showing the sections and subsections of the \
respective talk."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn37568"

RPM_NAME = "texlive-semproc-2026.226.0.0.1svn37568-60.2.noarch.rpm"
RPM_HASH = "66fb9a5edc8c50e530ec8eb9fb8c5527aacf4f11616ce950e90c6282419cf2cbc5c532b7a38a89a73da33446a462d7b34d4d98d2ef2d3a5fb5c775741b52bd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semproc.cls \
texlive-semproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-bookmark.sty \
tex-csquotes.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-scrreprt.cls \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
