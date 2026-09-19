SUMMARY = "Online validation of Yubikey OTPs"
DESCRIPTION = "This project implements online validation of Yubikey OTPs.· \
It is written in C and provides a shared library for use by other software."
LICENSE = "BSD-2-Clause"

PV = "2.15"

RPM_NAME = "libykclient-devel-2.15-1.37.aarch64.rpm"
RPM_HASH = "8d71627b1445ace80e5f50bde4e4d526a278d245eaa2c55845434550d2d147e1fcb5797896d8d3dcaf1fb8c5bdbd9a5a57a54063d7022fda75829c5d5f6c90ff"

RPROVIDES:${PN} += "libykclient-devel"

RDEPENDS:${PN} += "glibc-devel \
libykclient3"

inherit rpm
