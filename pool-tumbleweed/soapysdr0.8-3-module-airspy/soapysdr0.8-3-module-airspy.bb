SUMMARY = "SoapySDR Airspy module"
DESCRIPTION = "Soapy Airspy - Airspy device support for Soapy SDR. \
A Soapy module that supports Airspy devices within the Soapy API."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "soapysdr0.8-3-module-airspy-0.2.0-5.1.aarch64.rpm"
RPM_HASH = "86be8fae30b2c87ad836a56285f7923dd0e721ac4520be2e6a8706a1334010cdc5dea6b3d8e0abc8d25240ae270f26303959418db03deba5834459e4108a3ac7"

RPROVIDES:${PN} += "libairspySupport.so \
soapysdr0.8-3-module-airspy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libairspy.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
