SUMMARY = "Development files for libsoundio"
DESCRIPTION = "A C99 library for realtime audio input/output. \
 \
This package contains header files and libraries needed to develop \
application that use libsoundio."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libsoundio-devel-2.0.0-1.21.aarch64.rpm"
RPM_HASH = "e550057a8328fc715e5978b4c1b9aca53b51b748d75c40ee95628b71b2271b1fd1fe0bc4a36364df2f7beac237f800a1f661fc93f8faa427cf489e39db52ceb2"

RPROVIDES:${PN} += "libsoundio-devel"

RDEPENDS:${PN} += "libsoundio2"

inherit rpm
