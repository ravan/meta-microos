SUMMARY = "Static library for -static linking with libxcrypt"
DESCRIPTION = "This package contains the libxcrypt static libraries for -static \
linking.  You don't need this, unless you link statically, which \
is highly discouraged."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.5.2"

RPM_NAME = "libxcrypt-devel-static-4.5.2-2.4.aarch64.rpm"
RPM_HASH = "ed873b61810dda662d9d8743d81100966a5a5d33223814b028988c1d7f042c370713dd2b2a7c5a2288a3840cff067283b106283c4a5de26cafb4e38ea5b30287"

RPROVIDES:${PN} += "glibc-devel-static-/usr/lib64/libcrypt.a \
libxcrypt-devel-static"

RDEPENDS:${PN} += "glibc-devel-static \
libxcrypt-devel"

inherit rpm
