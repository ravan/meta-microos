SUMMARY = "Recurrent neural network for audio noise reduction - Development Files"
DESCRIPTION = "RNNoise is a noise suppression library based on a recurrent neural network. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "rnnoise-devel-0.2-2.9.aarch64.rpm"
RPM_HASH = "7bcf23b902a64cee6c15f711631d52c44263e00fca03521e24ae050c440859fed9a07d6051a0a2ac1cfcce613da96029a473dfa5b10aa9ea9abd3f5af01265e4"

RPROVIDES:${PN} += "pkgconfig-rnnoise \
rnnoise-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librnnoise0"

inherit rpm
