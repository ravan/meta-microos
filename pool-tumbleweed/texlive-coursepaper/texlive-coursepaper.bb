SUMMARY = "Prepare university course papers"
DESCRIPTION = "Coursepaper is a class with which students can provide simple \
course papers, in a uniform design to ease the task of marking."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-coursepaper-2026.226.2.0svn15878-61.2.noarch.rpm"
RPM_HASH = "f344619500ffde4a67aa5a6d1fd6bac6c23a81b956cb44b9b9c6706dd73e41ceb9728d9693aa1b59c6aaa47733a34191a5fcb92abca3b504eae0f119f6752265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coursepaper.cls \
texlive-coursepaper"

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
