SUMMARY = "ZeroMQ Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) via ZeroMQ."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-emperor_zeromq-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "77bfdad7a332887bbf4c5d082120bf074f96f2e26fde8964a6383d1e37689a2317c9288103329fdfd4502eb7973c8f73a849f529f8693225d7fe65b894492199"

RPROVIDES:${PN} += "uwsgi-emperor-zeromq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
uwsgi"

inherit rpm
