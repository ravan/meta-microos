SUMMARY = "SoapySDR BladeRF module"
DESCRIPTION = "Soapy BladeRF - BladeRF device support for Soapy SDR. \
A Soapy module that supports BladeRF devices within the Soapy API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "soapysdr0.8-3-module-bladerf-0.4.2-4.1.aarch64.rpm"
RPM_HASH = "4f9213475a80a5d586b5714abf464adb1e6275de015aca2f9a08a32e8e57a0b6851ca10dd324600ee49816443419d0addc0cbac52057697b770c7c073c3d4d75"

RPROVIDES:${PN} += "libbladeRFSupport.so \
soapysdr0.8-3-module-bladerf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libbladeRF.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
