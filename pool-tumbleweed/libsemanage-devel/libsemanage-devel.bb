SUMMARY = "Header files and libraries for SELinux's policy management libary"
DESCRIPTION = "The libsemanage-devel package contains the libraries and header files \
needed for developing applications that manipulate SELinux policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsemanage-devel-3.11-1.2.aarch64.rpm"
RPM_HASH = "637d5ffa3cd1938a5874984e5ba9a1c011bb9669e9370d54f5716cd481465e05436ca7779dfcaabea0ef342a4399dc3e42895e657ba962e23bacee6eaba4cbe9"

RPROVIDES:${PN} += "libsemanage-devel \
pkgconfig-libsemanage"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsemanage2 \
pkgconfig-libselinux \
pkgconfig-libsepol"

inherit rpm
