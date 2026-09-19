SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file. \
 \
This package contains a command-line utility to convert the ALAC format."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "alac-0.0+git.20160511-4.9.aarch64.rpm"
RPM_HASH = "ad5a08375df3b23b34bbf8a7fee1c0fa318dc8a6d51430257fc0fb5c4f6a8f6ef655b4e8f009abbd9a04fc8541b189c29a6661198a3738b3656941232e222ff9"

RPROVIDES:${PN} += "alac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalac.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
