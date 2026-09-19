SUMMARY = "A Sample Rate Converter Library"
DESCRIPTION = "Secret Rabbit Code (aka libsamplerate) is a Sample Rate Converter for \
audio. One example of where such a thing would be useful is in \
converting audio from the CD sample rate of 44.1kHz to the 48kHz sample \
rate used by DAT players. \
 \
SRC is capable of arbitrary and time varying conversions; from \
downsampling by a factor of 12 to upsampling by the same factor.  The \
conversion ratio can also vary with time for speeding up and slowing \
down effects."
LICENSE = "BSD-2-Clause"

PV = "0.2.2"

RPM_NAME = "libsamplerate0-0.2.2-3.8.aarch64.rpm"
RPM_HASH = "06ebe03dcfc4ea109e2505941e6196ee813a9c5e5641910a331d5cadb4cfbb3d47e562046f072d783de0eb63afb1cc21f7965c80da35f2a9ff1b0f815172eb34"

RPROVIDES:${PN} += "libsamplerate \
libsamplerate.so.0 \
libsamplerate0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
