SUMMARY = "Global warnings at the end of the logfile"
DESCRIPTION = "This package is obsolete. For LaTeX-format 2020-10-01 and \
newer: Instead of \\addglobalwarning{ something } use \
\\AddToHook{enddocument/info}{ something } and do not load the \
warning package. For older formats this package provides a \
command that generates a list of warnings that are printed out \
at the very end of the logfile. This is useful for warnings \
such as 'Rerun for this or that reason' or 'This is a draft, \
change it before the final run'."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn73265"

RPM_NAME = "texlive-warning-2026.226.0.0.11svn73265-60.2.noarch.rpm"
RPM_HASH = "0182009a88f325d56ffb278f366a504dff1f7e4c9a15a64eb204fdf1344b3f802afd5b99c8ad83a983666abebf4186493556634448a80167f30c61dc09f971aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-warning.sty \
texlive-warning"

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
