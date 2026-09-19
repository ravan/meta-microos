SUMMARY = "Development files for libbde, used to access Bitlocker Drive Encrypted Volumes"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbde."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260903"

RPM_NAME = "libbde-devel-20260903-1.2.aarch64.rpm"
RPM_HASH = "c70d2b9e16adfdd803820c3b08a4958f5a4e3705c70e7e2f84fba00ac66391704ba28051db56ac80cec232a14231c8c347e5d9b3c625e68e106b382a79aa4070"

RPROVIDES:${PN} += "libbde-devel \
pkgconfig-libbde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbde1 \
libbfio-devel"

inherit rpm
