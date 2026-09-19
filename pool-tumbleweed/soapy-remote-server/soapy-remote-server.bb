SUMMARY = "Server for remote device support for Soapy SDR"
DESCRIPTION = "A server that supports remote devices for the Soapy SDR. \
This package is intended to run on the system the sdr device is \
connected to."
LICENSE = "BSL-1.0"

PV = "0.5.2"

RPM_NAME = "soapy-remote-server-0.5.2-7.1.aarch64.rpm"
RPM_HASH = "dd2d51d67cfaf5b4ea71178b6265e3ca34e20f286a68665694c56f261a1ac2f2c304da3fe076967f8758a9ed99729caec72834f6957f4b7cc105f1ab32f711c8"

RPROVIDES:${PN} += "soapy-remote-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
