SUMMARY = "XTRX's fork from myriadrf/LMS7002M-driver - devel"
DESCRIPTION = "XTRX's fork from myriadrf/LMS7002M-driver. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of xtrx_lms7002m."
LICENSE = "Apache-2.0"

PV = "0.0.0+git.20171206"

RPM_NAME = "xtrx_lms7002m-devel-0.0.0+git.20171206-3.5.aarch64.rpm"
RPM_HASH = "6d75cda082db8d33883b49a9ca6bcaadc11568627e2eb41294a274f681126b3fdff9adc6946a2b07b709874c331402a98f2730fb53d34f26ff876190c2771e85"

RPROVIDES:${PN} += "xtrx-lms7002m-devel"

RDEPENDS:${PN} += "libxtrx-lms7002m0-0-0-SUSE"

inherit rpm
