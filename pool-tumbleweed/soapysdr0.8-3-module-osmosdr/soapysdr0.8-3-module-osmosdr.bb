SUMMARY = "SoapySDR osmosdr module"
DESCRIPTION = "Soapy OsmoSDR - OsmoSDR device support for Soapy SDR. \
A Soapy module that supports OsmoSDR devices within the Soapy API."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5"

RPM_NAME = "soapysdr0.8-3-module-osmosdr-0.2.5-13.1.aarch64.rpm"
RPM_HASH = "d4cf5f167a07e93c98ebbcb6a5a06429e9bbf03d1779d3bf8d250f0adf5a7bf725f715d3c8300e10998328c2aae8cf97b25c3f358608b584e97ec4a0e203fc05"

RPROVIDES:${PN} += "libosmosdrSupport.so \
soapysdr0.8-3-module-osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapyOsmoSDR.so.0 \
libSoapySDR.so.0.8-3 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libosmosdr.so.0 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
