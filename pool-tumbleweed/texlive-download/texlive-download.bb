SUMMARY = "Allow LaTeX to download files using an external process"
DESCRIPTION = "The package allows the user to download files (using cURL or \
wget), from within a document. To run the external commands, \
LaTeX (or whatever) needs to be run with the --shell-escape \
flag; this creates a tension between your needs and the \
security implications of the flag; users should exercise due \
caution."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn52257"

RPM_NAME = "texlive-download-2026.226.1.2svn52257-59.2.noarch.rpm"
RPM_HASH = "190ba01732fb18df641a2995d8bdf8ec9352996d6e5c9c89fc874601a134613e7a8993d43cd5899ca1905022981ecf52969bf80e7f075189ccc1755e2976ae53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-download.sty \
texlive-download"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pdftexcmds.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
