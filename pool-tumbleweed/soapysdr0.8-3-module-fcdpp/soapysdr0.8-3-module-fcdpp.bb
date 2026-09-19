SUMMARY = "SoapySDR FUNcube Dongle Pro+ module"
DESCRIPTION = "Soapy FCDPP - FUNcube Dongle Pro+ device support for Soapy SDR. \
A Soapy module that supports FUNcube Dongle Pro+ and Pro (V1.x) devices \
within the Soapy API."
LICENSE = "BSL-1.0"

PV = "0.2.0~git20251009.1ae85f0"

RPM_NAME = "soapysdr0.8-3-module-fcdpp-0.2.0~git20251009.1ae85f0-1.1.aarch64.rpm"
RPM_HASH = "c186febe191665ed0d2a9ed2fa421220110cd38449932782d52b461ab845070e840f998186b876b60bf60006baf7d1ee9ff07b41d528cdab11b8717d0bfe9a7f"

RPROVIDES:${PN} += "libFCDPPSupport.so \
soapysdr0.8-3-module-fcdpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-libusb.so.0 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
