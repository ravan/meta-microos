SUMMARY = "Header files for libattr"
DESCRIPTION = "This package contains the libraries and header files needed to develop \
programs which make use of extended attributes. For Linux programs, the \
documented system call API is the recommended interface, but an SGI \
IRIX compatibility interface is also provided."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libattr-devel-2.6.0-1.2.aarch64.rpm"
RPM_HASH = "b6ec3b71759ebc3ce39b2868fc4e6c84cc7ce055d5c1a2eb2fe2eb91ea1ea81c1e94f45ee579a11be3f8c2755d0bfa38a28c7f1b62af29e47d8088835cf52807"

RPROVIDES:${PN} += "attr-devel \
libattr-devel \
pkgconfig-libattr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libattr1"

inherit rpm
