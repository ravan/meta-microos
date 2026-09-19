SUMMARY = "SoapySDR AirspyHF+ module"
DESCRIPTION = "Soapy AirspyHF - AirspyHF+ device support for Soapy SDR. \
A Soapy module that supports AirspyHF+ devices within the Soapy API."
LICENSE = "MIT"

PV = "0.2.0+git20251009.7457d69"

RPM_NAME = "soapysdr0.8-3-module-airspyhf-0.2.0+git20251009.7457d69-1.1.aarch64.rpm"
RPM_HASH = "9f7ad51706ea475e7572bfb6f168f0eda4743260174a26effc136d589fc20d12d5195ca0163ef1c694a8378d6970a281f4c3613162019a3f522ffea16a81a425"

RPROVIDES:${PN} += "libairspyhfSupport.so \
soapysdr0.8-3-module-airspyhf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libairspyhf.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
