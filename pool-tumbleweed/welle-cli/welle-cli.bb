SUMMARY = "Receiver for DAB and DAB+ broadcast radio: command line tool"
DESCRIPTION = "Receive digital audio broadcasts with your computer: welle.io is an open source \
DAB and DAB+ software defined radio (SDR) with direct support for RTL-SDR and \
other SDR hardware through SoapySDR. \
 \
This package contains the welle-cli command line tool that does not need GUI"
LICENSE = "GPL-2.0-or-later"

PV = "2.7"

RPM_NAME = "welle-cli-2.7-1.6.aarch64.rpm"
RPM_HASH = "72948234f528ecd704350c96ec85a5b92709e80ad719de24a934c4fc17cb139f3918c57dd3ca889e9485e1bcd0bcb2e547376ce5b8e795d58e3c6599e4e5363d"

RPROVIDES:${PN} += "welle-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libSoapySDR.so.0.8-3 \
libairspy.so.0 \
libasound.so.2 \
libc.so.6 \
libfdk-aac.so.2 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmp3lame.so.0 \
libmpg123.so.0 \
librtlsdr.so.0 \
libstdc++.so.6"

inherit rpm
