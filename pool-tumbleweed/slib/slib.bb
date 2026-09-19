SUMMARY = "Portable Scheme Library"
DESCRIPTION = "SLIB is a portable Scheme library providing compatibility and utility \
functions for all standard Scheme implementations."
LICENSE = "SUSE-SLIB"

PV = "3c1"

RPM_NAME = "slib-3c1-1.6.noarch.rpm"
RPM_HASH = "c204f1102f1e3a43bd8a6816812ed165d50ee575cff9344d052a09a0e470d90d8ab7739bc53c3a1fff98f938187e599d29b6756ead81c02407b51ce3aff77074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
guile1"

inherit rpm
