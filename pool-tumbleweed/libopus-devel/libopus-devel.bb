SUMMARY = "Opus Audio Codec Library Development Environment"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "libopus-devel-1.6.1-1.5.aarch64.rpm"
RPM_HASH = "3ba44ca86aa911d4b4d7448b81b7485c5977ecbf364c5b955d65a10a09f16c8ea657786fe1615891d35394702df3f50b6c60a51d6d053875aed589d114efc7a3"

RPROVIDES:${PN} += "libopus-devel \
pkgconfig-opus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopus0"

inherit rpm
