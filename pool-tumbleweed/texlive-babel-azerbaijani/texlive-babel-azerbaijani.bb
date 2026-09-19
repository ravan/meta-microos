SUMMARY = "Support for Azerbaijani within babel"
DESCRIPTION = "This is the babel style for Azerbaijani. This language poses \
special challenges because no 'traditional' font encoding \
contains the full character set, and therefore a mixture must \
be used (e.g., T2A and T1). This package is compatible with \
Unicode engines (LuaTeX, XeTeX), which are very likely the most \
convenient way to write Azerbaijani documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn44197"

RPM_NAME = "texlive-babel-azerbaijani-2026.226.1.0asvn44197-60.2.noarch.rpm"
RPM_HASH = "e6bc3eaaa3ba21f405e6493c8d9b340beac404ec3f6b56c30afa6f29cfe69443e2a6c1ae066f7e6aa50e6a550f2e77e0df15a0a0b1e3f0797641f3d04491c8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-azerbaijani.ldf \
texlive-babel-azerbaijani"

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
