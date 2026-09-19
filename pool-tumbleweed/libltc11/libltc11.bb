SUMMARY = "Linear/longitudinal timecode library"
DESCRIPTION = "Linear (or Longitudinal) Timecode (LTC) is an encoding of SMPTE timecode \
data as a Manchester-Biphase encoded audio signal. The audio signal is \
commonly recorded on a VTR track or other storage media. \
 \
libltc provides functionality to encode and decode LTC audio from/to SMPTE \
or EBU timecode, including SMPTE date support."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "libltc11-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "9f2e9c496656f60d058c56ec094482af78e1eb382a84628610b84d80628a554730a6c3186b68b5430c99da0ba1941dca0e55630333541fe85859e0d565426a50"

RPROVIDES:${PN} += "libltc.so.11 \
libltc11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
