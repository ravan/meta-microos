SUMMARY = "GSM 06.10 Lossy Speech Compressor Library and Utilities"
DESCRIPTION = "Contains binaries for a GSM speech compressor, verified against the \
ETSI standard test patterns. \
 \
libgsm implements the European GSM 06.10 provisional standard for \
full-rate speech transcoding, prI-ETS 300 036, which uses RPE/LTP \
(residual pulse excitation/long term prediction) coding at 13 kbit/s. \
GSM 06.10 compresses frames of 160 13-bit samples (8 kHz sampling \
rate) into 260 bits. \
 \
The front-end is modeled after the historic compress(1) utility."
LICENSE = "ISC"

PV = "1.0.24"

RPM_NAME = "libgsm-utils-1.0.24-1.3.aarch64.rpm"
RPM_HASH = "7fea1f3a55642cfde4c9aa08dd5acf0e30c66442a3607a31e4a0c137f8b3ea68b078b30b9a001c715d14ed33430de34b70fd1293de305cef06b8cedfe1aafdcf"

RPROVIDES:${PN} += "libgsm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsm.so.1"

inherit rpm
