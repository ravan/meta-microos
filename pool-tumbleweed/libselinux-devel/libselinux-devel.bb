SUMMARY = "Development files for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.11"

RPM_NAME = "libselinux-devel-3.11-2.1.aarch64.rpm"
RPM_HASH = "15f2836bbcca7d44f1f4284f4f37e609e690deccad901ecd8da6ddcd5f997864691394d8f17d775bd68b9c78d43deba269271e08bc8ee336168d8ca90ba5d8ac"

RPROVIDES:${PN} += "libselinux-devel \
pkgconfig-libselinux"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libselinux1 \
pkgconfig-libpcre2-8 \
pkgconfig-libsepol"

inherit rpm
