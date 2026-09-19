SUMMARY = "ACARS SDR decoder"
DESCRIPTION = "A multi-channel ACARS decoder with built-in rtl_sdr and airspy front ends, \
which can also decode from an ALSA capture device or from an audio file. \
Decoded messages can be written to files or sent over UDP in one-line, full \
text, PlanePlotter, acarsserv or JSON format, and ARINC-622 ATS applications \
(ADS-C, CPDLC) are decoded through libacars. It comes with a database \
backend, acarsserv, to store received ACARS messages."
LICENSE = "GPL-2.0-only"

PV = "4.6"

RPM_NAME = "acarsdec-4.6-1.1.aarch64.rpm"
RPM_HASH = "8e348c302e184e07e1e85345729504085ad9687353e36022c03dafddaa0f1e7f50910ff209f8d4d17885d791cd244ae6198f075cb3a865972fe5772ecb5083a9"

RPROVIDES:${PN} += "acarsdec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacars-2.so.2 \
libairspy.so.0 \
libasound.so.2 \
libc.so.6 \
libcjson.so.1 \
libm.so.6 \
libmvec.so.1 \
librtlsdr.so.0 \
libsndfile.so.1"

inherit rpm
