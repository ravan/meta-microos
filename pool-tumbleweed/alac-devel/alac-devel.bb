SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "alac-devel-0.0+git.20160511-4.9.aarch64.rpm"
RPM_HASH = "636279f380466cd55cfed3ab432d6b2f5528c7ddc66f91afeddbc1d5ead9e736e6516167249f9170639ceb40ee2655d8936401837d6a80378b53ec2314226b70"

RPROVIDES:${PN} += "alac-devel \
libalac-devel"

RDEPENDS:${PN} += "libalac0"

inherit rpm
