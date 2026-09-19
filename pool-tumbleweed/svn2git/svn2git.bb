SUMMARY = "Importer for one time conversion from SVN to Git"
DESCRIPTION = "Tool to convert an SVN repository to Git based on a custom written ruleset, in \
order to properly migrate all branches and tags."
LICENSE = "GPL-3.0-only"

PV = "1.0.20"

RPM_NAME = "svn2git-1.0.20-1.2.aarch64.rpm"
RPM_HASH = "27bdc270457003993570d08ad0f81f950875f992d0ec41d70cd2fc1ec18ed712d88756cf6bc5395671ef28a9cd6a0c4adbe289ea2b4abe63cd753ad6afea9448"

RPROVIDES:${PN} += "svn2git"

RDEPENDS:${PN} += "git \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libapr-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libsvn-fs-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm
