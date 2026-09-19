SUMMARY = "Hard wrap text to a certain character length"
DESCRIPTION = "The package facilitates wrapping text to a specific character \
width, breaking lines by words rather than, as done by TeX, by \
characters. The primary use for these facilities is to aid the \
generation of messages sent to the log file or console output \
to display messages to the user. Package authors may also find \
this useful when writing out arbitrary text to an external \
file."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-hardwrap-2026.226.0.0.2svn77682-60.4.noarch.rpm"
RPM_HASH = "53ac72d11cffbf2be64d3e348ad63fb3d25098220db6acce9df8755596ece5b341e3a461a7358c0773fc1a1a4c5682573e144ab5fd32473e777497c178cf4718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hardwrap.sty \
texlive-hardwrap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifplatform.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
