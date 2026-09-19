SUMMARY = "GSM 06.10 Lossy Speech Compressor Library and Utilities"
DESCRIPTION = "Contains the library for a GSM speech compressor. \
 \
libgsm implements the European GSM 06.10 provisional standard for \
full-rate speech transcoding, prI-ETS 300 036, which uses RPE/LTP \
(residual pulse excitation/long term prediction) coding at 13 kbit/s. \
GSM 06.10 compresses frames of 160 13-bit samples (8 kHz sampling \
rate) into 260 bits."
LICENSE = "ISC"

PV = "1.0.24"

RPM_NAME = "libgsm1-1.0.24-1.3.aarch64.rpm"
RPM_HASH = "8209205d54cbd3e5e71252dc77aa332044a836c6ebae493981e6b4ca7c26dcb936bfa12cae1e93cae648844ba7069e1cd0b6ac2b48be512a95b91ae75c116870"

RPROVIDES:${PN} += "libgsm.so.1 \
libgsm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
