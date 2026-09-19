SUMMARY = "SoapySDR mirisdr module"
DESCRIPTION = "Soapy mirisdr - mirisdr device support for Soapy SDR. \
A Soapy module that supports Mirics SDR devices within the Soapy API."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5"

RPM_NAME = "soapysdr0.8-3-module-mirisdr-0.2.5-13.1.aarch64.rpm"
RPM_HASH = "736f2dee0f82260385119d97a52b1f2a360c4f0b94219ba63c8218db2a8163ada7f76649b3d0565077820e93399114b5dfb100041604bdb9ef0631d6886ff0e3"

RPROVIDES:${PN} += "libmiriSupport.so \
soapysdr0.8-3-module-mirisdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapyOsmoSDR.so.0 \
libSoapySDR.so.0.8-3 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libmirisdr.so.4 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
