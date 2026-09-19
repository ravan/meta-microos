SUMMARY = "Development files for the USB CEC adapter communication library"
DESCRIPTION = "libCEC is an enabling platform for the CEC bus in HDMI, it allows \
developers to interact with other HDMI devices without having to \
worry about the communication overhead, handshaking, and the various \
ways of sending a message for each vendor. \
 \
This subpackage contains the headers for libcec."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.7"

RPM_NAME = "libcec-devel-8.1.7-1.1.aarch64.rpm"
RPM_HASH = "374dcfe21aa3a6456c80f108a22b009c9e965230fd87a23f6031d5789cb0168b6b60275bfb5afa9c7fcba44198f602774134733181e46896f4feb496352533e1"

RPROVIDES:${PN} += "cmake-libcec \
libcec-devel \
pkgconfig-libcec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcec8"

inherit rpm
