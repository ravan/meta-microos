SUMMARY = "SoapySDR RedPitaya module"
DESCRIPTION = "Soapy RedPitaya - RedPitaya device support for Soapy SDR. \
A Soapy module that supports RedPitaya devices within the Soapy API."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "soapysdr0.8-3-module-redpitaya-0.1.1-1.1.aarch64.rpm"
RPM_HASH = "e3bb5c7ed09ab5dba0bbb8e75fc0ce9998cafe8e24aa6395b7f3be76bcc4c5c218519b8227bc46b9e6ba5e781f6e90d22ee661cfc27425597251edc3ae274f6f"

RPROVIDES:${PN} += "libRedPitaya.so \
soapysdr0.8-3-module-redpitaya"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
