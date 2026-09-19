SUMMARY = "Compile segments of LaTeX documents"
DESCRIPTION = "This tool compiles individual files that are included as parts \
of larger documents. It utilizes the preamble of the main \
document but disregards all other included files. The main \
purpose is to allow fast compilation of particular chapters or \
sections, eliminating the need to recompile the entire \
document. This facilitates an efficient way to check for \
formatting or syntax errors in the particular part of the \
document being worked on."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn68961"

RPM_NAME = "texlive-texblend-2026.227.0.0.1svn68961-62.2.noarch.rpm"
RPM_HASH = "f43c2ae8dad58b072e9aef607853036596d8d7f6c0b71957c70632ffe754a39e5ec61433ab5319f539f9abddacba9c1e23cd5b61dbf0c7ff539220e509605a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texblend"

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
texlive-scripts-bin \
texlive-texblend-bin"

inherit rpm
