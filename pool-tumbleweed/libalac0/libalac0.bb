SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "libalac0-0.0+git.20160511-4.9.aarch64.rpm"
RPM_HASH = "1a477716c1e4e73eed96b85f0144c311c0d88258967948507de4ef3ec2171ec082311ef61099c4d15fd6cfbcc2ceb7a87b704a2a7790d4dec7d1d48444a3b842"

RPROVIDES:${PN} += "libalac.so.0 \
libalac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
