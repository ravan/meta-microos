SUMMARY = "Typesetting stageplay scripts"
DESCRIPTION = "Plari (the name comes from the Finnish usage for the working \
copy of a play) is a report-alike class, without section \
headings, and with paragraphs vertically separated rather than \
indented."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-plari-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "7f66fbf1e06f2bf20508bc28d40a96dfd7ab312f9c1c938fc2742a9ea4ffc01652d34ddf7481e44707b01f163147469b6f8b4edc8224dce3ef2a217c18ea9af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plari.cls \
texlive-plari"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
