SUMMARY = "Linear/longitudinal timecode library"
DESCRIPTION = "Linear (or Longitudinal) Timecode (LTC) is an encoding of SMPTE timecode \
data as a Manchester-Biphase encoded audio signal. The audio signal is \
commonly recorded on a VTR track or other storage media. \
 \
libltc provides functionality to encode and decode LTC audio from/to SMPTE \
or EBU timecode, including SMPTE date support."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "libltc-devel-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "d6f4c35d49c21ae61bc0927cc9c17de5d6beec4e853fc2a62183b9daa1fed7eeb876cfba960948f37777ef6154b045b922a9b416aff7978dddf442c574d57066"

RPROVIDES:${PN} += "libltc-devel \
pkgconfig-ltc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libltc11"

inherit rpm
