SUMMARY = "Creates an overview of a document's state"
DESCRIPTION = "Progress is a package which. when compiling TeX and LaTeX \
documents, generates a HTML file showing an overview of a \
document's state (of how finished it is). The report is sent to \
file \\ProgressReportName, which is by default the \\jobname with \
the date appended (but is user-modifiable)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn19519"

RPM_NAME = "texlive-progress-2026.226.1.10svn19519-59.2.noarch.rpm"
RPM_HASH = "9c08525afd2fe0253a05916196cd2f1a13937de71436c93860388af01b43cd8f5529595f2304b3c4b4fb2fea72ce3dd1afbec498d34e38ad017e651ae335d40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-progress.sty \
texlive-progress"

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
