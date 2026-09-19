SUMMARY = "Block diagrams and bond graphs, with MetaPost"
DESCRIPTION = "A set of simple MetaPost macros for the task. While the task is \
not itself difficult to program, it is felt that many users \
will be happy to have a library for the job.."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-blockdraw_mp-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "e116adf9d8765d091e718861d122e1711fd66b51da5f28543a66fbe70c8c7bd657da9de0207a575576d433005edeea118b4ea653cbd8a1e5739f228768076f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blockdraw-mp"

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
