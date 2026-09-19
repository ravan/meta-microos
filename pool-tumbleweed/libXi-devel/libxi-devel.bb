SUMMARY = "Development files for the X Input Extension library"
DESCRIPTION = "libXi is the client-side library for the X Input Extension. \
 \
This package contains the development headers for the library found \
in libXi6."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "libXi-devel-1.8.3-1.3.aarch64.rpm"
RPM_HASH = "c6848f748f0731d283059901e68e0bb398ce37c34b99311a9c95ac0eb7fab0845ef13999d9cb12583a165a5da032319212bcc740fe7be5d02801f6bd29f5dcde"

RPROVIDES:${PN} += "libXi-devel \
libXi6-devel \
pkgconfig-xi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXi6 \
pkgconfig-inputproto \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xfixes"

inherit rpm
