SUMMARY = "Static archives for SELinux's binary policy manipulation library"
DESCRIPTION = "The libsepol-devel-static package contains the static libraries \
needed for developing applications that manipulate binary SELinux \
policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsepol-devel-static-3.11-1.2.aarch64.rpm"
RPM_HASH = "a0af6fbc992b0f33004240f23a6d0ea78c7eecf1f18217132e52676a2a812559324dc8743f2b569560fbb836dd5a0512dddfad8a645dea0539a860785b481098"

RPROVIDES:${PN} += "libsepol-devel-static"

RDEPENDS:${PN} += "libsepol-devel"

inherit rpm
