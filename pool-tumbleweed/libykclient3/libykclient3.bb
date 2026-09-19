SUMMARY = "Online validation of Yubikey OTPs"
DESCRIPTION = "This project implements online validation of Yubikey OTPs. \
It is written in C and provides a shared library for use by other software."
LICENSE = "BSD-2-Clause"

PV = "2.15"

RPM_NAME = "libykclient3-2.15-1.37.aarch64.rpm"
RPM_HASH = "56a524ac8566f4df1161a50b782fc717bef5b99b7600c5c271aa068de5d8d4f30b1d902675887144e867e5399a133128ad614d9fc9b773842fe2c6589fa8b5f8"

RPROVIDES:${PN} += "libykclient.so.3 \
libykclient3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
