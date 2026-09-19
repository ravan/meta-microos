SUMMARY = "Soapy SDR plugins for Osmo supported SDR devices"
DESCRIPTION = "Soapy Osmo - Osmo SDR module \
Soapy SDR plugins for OsmoSDR devices"
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5"

RPM_NAME = "libSoapyOsmoSDR0-0.2.5-13.1.aarch64.rpm"
RPM_HASH = "e2e7fe893bd7eed84f0c423a3c618a772fdefb2c68489f08c904355dca90bcf979ec9d9e2078796eb63754bb8de02bd58d4aca6fdf8fec3934483564cc0ad503"

RPROVIDES:${PN} += "libSoapyOsmoSDR.so.0 \
libSoapyOsmoSDR0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
