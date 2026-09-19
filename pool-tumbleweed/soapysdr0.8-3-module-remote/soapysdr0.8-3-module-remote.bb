SUMMARY = "Remote device support for Soapy SDR"
DESCRIPTION = "A Soapy module that supports remote devices within the Soapy API."
LICENSE = "BSL-1.0"

PV = "0.5.2"

RPM_NAME = "soapysdr0.8-3-module-remote-0.5.2-7.1.aarch64.rpm"
RPM_HASH = "5ddb9a6d02733993f48906cdb6f118c464b07ce4ce6bffae5ff308cb4e3c29fdd0909ad7e8416258b586a7767061490bec50237dc2f5318a7a72cceeb4aa2f7c"

RPROVIDES:${PN} += "libremoteSupport.so \
soapy-remote-module \
soapysdr0.8-3-module-remote"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
