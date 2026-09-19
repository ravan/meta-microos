SUMMARY = "General-purpose software audio FSK modem"
DESCRIPTION = "Minimodem is a command-line program which decodes (or generates) audio \
modem tones at any specified baud rate, using various framing protocols. \
It acts a general-purpose software FSK modem, and includes support for \
various standard FSK protocols such as Bell103, Bell202, RTTY, TTY/TDD, \
NOAA SAME, and Caller-ID. \
 \
Minimodem can play and capture audio modem tones in real-time via the \
system audio device, or in batched mode via audio files. \
 \
Minimodem can be used to transfer data between nearby computers using an \
audio cable (or just via sound waves), or between remote computers using \
radio, telephone, or another audio communications medium."
LICENSE = "GPL-3.0+"

PV = "0.24"

RPM_NAME = "minimodem-0.24-1.33.aarch64.rpm"
RPM_HASH = "328a58f077cb29986c279e3f572e9118d19f887c32be33602a1e84f2954b02178caacde9130ba0b4a54a91eb6de7253fa603558d9cc7293fa9bd7cab7ba28ac6"

RPROVIDES:${PN} += "minimodem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1"

inherit rpm
