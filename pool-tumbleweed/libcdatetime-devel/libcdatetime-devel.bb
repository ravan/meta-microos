SUMMARY = "Development files for libcdatetime, a PFF/OFF file format library"
DESCRIPTION = "libcdatetime is a library C date and time functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdatetime."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcdatetime-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "7092f743427a14911b59aaf6064d781151fd3ebeb2ac86beb4226f755e8e1031515b393c41d4123eafb8cae695dd5394e7370b30bcdc11a00adffc51fbc36042"

RPROVIDES:${PN} += "libcdatetime-devel \
pkgconfig-libcdatetime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdatetime1"

inherit rpm
