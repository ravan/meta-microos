SUMMARY = "Soapy SDR plugins for UHD supported SDR devices"
DESCRIPTION = "Soapy UHD - Soapy SDR devices for UHD. \
A UHD module that supports Soapy devices within the UHD API."
LICENSE = "GPL-3.0-only"

PV = "0.4.1git20250213"

RPM_NAME = "soapysdr0.8-3-module-uhd-0.4.1git20250213-4.1.aarch64.rpm"
RPM_HASH = "6b2f660c50dcd2418a66eb043a19264484a7ebe02ca85271d3f1c45facb72ef374b0bac2f82357bfdc5c00df3deddd2e998629b23454d5aacdf7fec47f25ea3b"

RPROVIDES:${PN} += "libsoapySupport.so \
libuhdSupport.so \
soapy-uhd-module \
soapysdr0.8-3-module-uhd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuhd.so.4.10.0 \
soapy-sdr"

inherit rpm
