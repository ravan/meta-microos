SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "5.0+0"

RPM_NAME = "libffms2-devel-5.0+0-1.14.aarch64.rpm"
RPM_HASH = "d191ee7d3023a3b82f6d14c7e53e64ce491816e7a8c9ec83a17e104caf57f2fdcbe1f27c0e2a5341e2d56f417f9693dbe10f805ec3c280ad597a37cb2186476b"

RPROVIDES:${PN} += "libffms2-devel \
pkgconfig-ffms2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffms2-5"

inherit rpm
