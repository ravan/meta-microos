SUMMARY = "Memoir-based class for formatting University of Auckland masters' and doctors' theses"
DESCRIPTION = "A memoir-based class for formatting University of Auckland \
masters' and doctors' thesis dissertations in any discipline. \
The title page does not handle short dissertations for \
diplomas."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51323"

RPM_NAME = "texlive-aucklandthesis-2026.226.svn51323-60.2.noarch.rpm"
RPM_HASH = "b499154e2855d9abc0703d1ea364e8df073251971638711d5b969942eaf5f2400d3d17eeccff48df6d232b42e483f52758305638a9d6c76f74b4561af5bab107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aucklandthesis.cls \
texlive-aucklandthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-memoir.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
