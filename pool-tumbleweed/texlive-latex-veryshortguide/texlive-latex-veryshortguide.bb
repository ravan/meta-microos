SUMMARY = "The Very Short Guide to LaTeX"
DESCRIPTION = "This is a 4-page reminder of what LaTeX does. It is designed \
for printing on A4 paper, double-sided, and folding once to A5. \
Such an 'imposed' version of the document is provided in the \
distribution, as PDF. An analogous version is provided in \
'legal' format."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn55228"

RPM_NAME = "texlive-latex-veryshortguide-2026.226.0.0.7svn55228-63.2.noarch.rpm"
RPM_HASH = "99d1327e663f6c210f419ab42df4ffc214d03fbeb699eaf0ae7533c743208255651607c0b8d5e7a5713af183e07ff7987294749c643eec9a5348adb658ac410b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-veryshortguide"

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
