SUMMARY = "SoapySDR HackRF module"
DESCRIPTION = "Soapy HackRF - HackRF device support for Soapy SDR. \
A Soapy module that supports HackRF devices within the Soapy API."
LICENSE = "MIT"

PV = "0.3.4+git20251009.143ff5e"

RPM_NAME = "soapysdr0.8-3-module-hackrf-0.3.4+git20251009.143ff5e-1.1.aarch64.rpm"
RPM_HASH = "2b76c1d76a77441b69dacbf2b31903731efa88b193416f83135fb1e7e9badfbc28a0f5bc64fcbd9229f13ab7c3603294a958f26899a1d4a6e52205b704ebc78e"

RPROVIDES:${PN} += "libHackRFSupport.so \
soapysdr0.8-3-module-hackrf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libhackrf.so.0 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
