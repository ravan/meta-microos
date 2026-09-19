SUMMARY = "Development headers for Boost.Process library"
DESCRIPTION = "This package contains development headers for Boost.Process \
library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_process1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "7f947977f2339bd9a32380c6596863876ed41dbf9955dc94def984183b10e3c391a5d8821c1f4370e6443935dc0c157065f8cbb60cefc50b71d6f47b1c42c423"

RPROVIDES:${PN} += "libboost-process-devel-impl \
libboost-process1-91-0-devel"

RDEPENDS:${PN} += "libboost-context1-91-0-devel \
libboost-date-time1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-process1-91-0 \
libboost-regex1-91-0-devel"

inherit rpm
