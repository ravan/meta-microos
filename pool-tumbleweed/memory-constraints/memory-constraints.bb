SUMMARY = "Macros to limit resources allocation when building"
DESCRIPTION = "Macros to limit various resources when building huge packages to \
ensure we can produce results rather than OOM reports."
LICENSE = "MIT"

PV = "20180406"

RPM_NAME = "memory-constraints-20180406-6.1.noarch.rpm"
RPM_HASH = "65f25f8e1991741517fbab85e64bb33ea8e95e1121980f9ac767597ff421e560b5d6a823446befffd0c892c6f1778bd36223e43bce0a43ebb0206497cade916e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "memory-constraints \
rpm-macro-limit-build"

RDEPENDS:${PN} += "/usr/bin/awk \
coreutils"

inherit rpm
