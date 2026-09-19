SUMMARY = "C library static libraries for -static linking"
DESCRIPTION = "The glibc-devel-static package contains the C library static libraries \
for -static linking.  You don't need these, unless you link statically, \
which is highly discouraged."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "glibc-devel-static-2.44-2.1.aarch64.rpm"
RPM_HASH = "cb41df48e23bba44f159843601de327a14ee621233176418b4f70a9bd5658fd530f2c6f0a3ac51c0432faf490027f122e81b3b2ff93e120635d70e3b5ef27caf"

RPROVIDES:${PN} += "glibc-devel-static \
glibc-static"

RDEPENDS:${PN} += "glibc-devel \
libxcrypt-devel-static"

inherit rpm
