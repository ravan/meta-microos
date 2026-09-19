SUMMARY = "VisualOn AMR-WB encoder library"
DESCRIPTION = "This library contains an encoder implementation of the Adaptive \
Multi Rate Wideband (AMR-WB) audio codec. The library is based \
on a codec implementation by VisualOn as part of the Stagefright \
framework from the Google Android project."
LICENSE = "Apache-2.0"

PV = "0.1.3+5"

RPM_NAME = "libvo-amrwbenc0-0.1.3+5-1.12.aarch64.rpm"
RPM_HASH = "c859936ed3d7283d2eeda0def671368041b4fdc920be67ddeb492c0b35adc02e536318243c2620882a2142154a2aff4f4693e471202c75a549d0d3f40783f307"

RPROVIDES:${PN} += "libvo-amrwbenc.so.0 \
libvo-amrwbenc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
