SUMMARY = "PAPI runtime library"
DESCRIPTION = "This package contains the PAPI runtime library."
LICENSE = "BSD-3-Clause"

PV = "7.2.0"

RPM_NAME = "libpapi-7.2.0-1.6.aarch64.rpm"
RPM_HASH = "fde27fc879c6d73d2c54140e4b0d7f290047d3db8fb68b6ec52b9dca88c09bb982be987397242e3eabf68228d3332ccc1dbf04d944bacb833d6559633ee5268f"

RPROVIDES:${PN} += "libpapi \
libpapi.so.7.2 \
libsde.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4"

inherit rpm
