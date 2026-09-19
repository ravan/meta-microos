SUMMARY = "SoapySDR RTL-SDR support module"
DESCRIPTION = "Soapy RTL-SDR - RTL-SDR device support for Soapy SDR. \
A Soapy module that supports RTL-SDR devices within the Soapy API."
LICENSE = "MIT"

PV = "0.3.3+git20250825.b1f568d"

RPM_NAME = "soapysdr0.8-3-module-rtlsdr-0.3.3+git20250825.b1f568d-1.1.aarch64.rpm"
RPM_HASH = "a6551ea4da9f7457a62befc54d863cbe6d7b4e429d05fbb40912f83de49948020fa649ba42f2eda88fe64892defcafd4da0f1e88d758a45e5e70d7126d74ff90"

RPROVIDES:${PN} += "librtlsdrSupport.so \
soapysdr0.8-3-module-rtlsdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
librtlsdr.so.0 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
