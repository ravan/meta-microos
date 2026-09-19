SUMMARY = "MP3 Format Validator"
DESCRIPTION = "mp3_check helps identifying, in detail, MP3 files that do not \
correctly follow the MPEG-1 Layer 3 format. It looks for invalid \
frame headers, missing frames, etc., and generates statistics. This \
can especially be important when building a file archive of a certain \
quality."
LICENSE = "GPL-2.0-or-later"

PV = "1.98"

RPM_NAME = "mp3_check-1.98-3.22.aarch64.rpm"
RPM_HASH = "6e8a5bae868f4f5952919e90126f6a3eb146ba3c0fbfffc9d825e4b886b0876cf16ae7490ec8425a962f2db581532a25171a6cd24102c12a6c9b64cfc02a1efd"

RPROVIDES:${PN} += "mp3-check"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
