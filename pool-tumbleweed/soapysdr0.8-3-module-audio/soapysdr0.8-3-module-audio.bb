SUMMARY = "SoapySDR module for audio devices"
DESCRIPTION = "Soapy Audio - audio device support for Soapy SDR. \
A Soapy module that supports audio devices within the Soapy API. \
 \
This lets any soundcard-class receiver (Softrock, SDR transceivers on a \
line-in, FUNcube dongles) appear as a SoapySDR device, with optional hamlib \
rig control for frequency tuning."
LICENSE = "MIT"

PV = "0.1.1+git20251009.63b22ec"

RPM_NAME = "soapysdr0.8-3-module-audio-0.1.1+git20251009.63b22ec-1.1.aarch64.rpm"
RPM_HASH = "40873c76021c430d47f96d579e548de02f96690b79a696b106f0bf524097fa5b1b3d8194ba5b85a1ee5580ce190a968ef0e47d7a1e6897648483e002dd125f91"

RPROVIDES:${PN} += "bundled-rtaudio \
libaudioSupport.so \
soapysdr0.8-3-module-audio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libhamlib.so.4 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
soapy-sdr"

inherit rpm
