SUMMARY = "SoapySDR XTRX module"
DESCRIPTION = "Soapy XTRX - XTRX device support for Soapy SDR. \
A Soapy module that supports XTRX devices within the Soapy API."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "soapysdr0.8-3-module-xtrx-0.0.0+git.20201202-6.3.aarch64.rpm"
RPM_HASH = "7d1ab87889512f44d031c08ccdc72e399972fbefeea51718e520c2e6e76d376be4bf434d2f113f700d18e14bec740a40e81aaecce4123c43753b6254a5c8717a"

RPROVIDES:${PN} += "libXTRXSupport.so \
soapysdr0.8-3-module-xtrx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxtrx.so.0"

inherit rpm
