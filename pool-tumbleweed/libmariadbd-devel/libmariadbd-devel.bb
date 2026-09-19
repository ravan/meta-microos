SUMMARY = "MariaDB embedded server development files"
DESCRIPTION = "This package contains the development header files and libraries \
for developing applications that embed the MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "libmariadbd-devel-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "e29358ff4a74a8eb30e067979b7f4a9743239ba82ffe47663803c4faef11bc99aa63cec0675ae2682368df819f9ff1cb67e5e20716c1f9600a11a4179548318d"

RPROVIDES:${PN} += "libmariadbd-devel \
libmysqld-devel"

RDEPENDS:${PN} += "libaio-devel \
libmariadb-devel \
libmariadbd19 \
tcpd-devel"

inherit rpm
