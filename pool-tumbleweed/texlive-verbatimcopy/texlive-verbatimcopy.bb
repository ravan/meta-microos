SUMMARY = "Make copies of text documents from within LaTeX"
DESCRIPTION = "This package provides \\VerbatimCopy{in}{out} that will enable \
LaTeX to take a verbatim copy of one text file, and save it \
under another name. The package provides a means to specify the \
output directory to be used, but does no checking and may \
therefore overwrite an important file if used injudiciously."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn15878"

RPM_NAME = "texlive-verbatimcopy-2026.226.0.0.06svn15878-60.2.noarch.rpm"
RPM_HASH = "87014755c2184b9994df89fe4e9e86e32622a120472aa0c35430cc30017b057d32b4754d6d2bdbddb52cc9c7b2fadbf5ff986be0a5e43acd709399cf91d74efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbatimcopy.sty \
texlive-verbatimcopy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
