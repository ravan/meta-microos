SUMMARY = "Development files for the X11 XTEST and RECORD extensions"
DESCRIPTION = "The XTEST extension is a minimal set of client and server extensions \
required to completely test the X11 server with no user intervention. \
This extension is not intended to support general journaling and \
playback of user actions. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocol and arbitrary X extension protocol. \
 \
This package contains the development headers for the library found \
in libXtst6."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "libXtst-devel-1.2.5-1.9.aarch64.rpm"
RPM_HASH = "fa1363af85d8da45a81d129a405d0740ddfe58bf7387fe26c7e65ee836105a96efdde55052bc59bfcb60673a05b918b5fc9bc7ab9b9730a4d7ccdffcec457969"

RPROVIDES:${PN} += "libXtst-devel \
pkgconfig-xtst"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXtst6 \
pkgconfig-recordproto \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xextproto \
pkgconfig-xi"

inherit rpm
