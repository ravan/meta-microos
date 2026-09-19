SUMMARY = "SoapySDR PlutoSDR module"
DESCRIPTION = "Soapy PlutoSDR - PlutoSDR device support for Soapy SDR. \
A Soapy module that supports PlutoSDR devices within the Soapy API."
LICENSE = "LGPL-2.1-only"

PV = "0.2.2"

RPM_NAME = "soapysdr0.8-3-module-plutosdr-0.2.2-1.1.aarch64.rpm"
RPM_HASH = "0e8a67b330a699f453b2cc9ce11ad8d409f3abdefba4e41441b957f4f89ca35b92a1e28dccbc273e6c21f3b38746526eac1f8bb977b4119e58d3229442d0b29b"

RPROVIDES:${PN} += "libPlutoSDRSupport.so \
soapysdr0.8-3-module-plutosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libad9361.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libiio.so.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
soapy-sdr"

inherit rpm
