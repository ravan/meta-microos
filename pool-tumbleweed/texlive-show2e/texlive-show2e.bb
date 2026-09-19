SUMMARY = "Variants of \\show for LaTeX2e"
DESCRIPTION = "This small package aims at making debugging (especially in an \
interactive way) easier, by providing \\show variants suited to \
LaTeX2e commands (whether with optional arguments or robust) \
and environments. The variant commands also display the \
internal macros used by such commands, if any. The \\showcs \
variant helps with macros with exotic names."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-show2e-2026.226.1.0svn78101-60.2.noarch.rpm"
RPM_HASH = "2577f10288d44e24219e64307c0c153d4cd51bb929b92ed2cc5c39f0fde50744e91269d91050938db7c9fe11ba34a3da1229d3fe75b81241ab1cbac38fa2b896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-show2e.sty \
texlive-show2e"

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
