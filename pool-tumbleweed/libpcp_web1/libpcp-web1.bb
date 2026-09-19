SUMMARY = "Performance Co-Pilot run-time web library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time web library"
LICENSE = "LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "libpcp_web1-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "e75ce4cbe714e21d61d036e1780b4d7905b80a79695543daf1c8b1e08c330938faf5c3bbaa5a21fc07fb4dd3946c3a4f560fa71da4b4f0f29e21d53a1e1fd8e2"

RPROVIDES:${PN} += "libpcp-web.so.1 \
libpcp-web1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcp-mmv.so.1 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libuv.so.1"

inherit rpm
