SUMMARY = "Online validation of Yubikey OTPs"
DESCRIPTION = "This project implements online validation of Yubikey OTPs. \
It is written in C and provides a shared library for use by other software."
LICENSE = "BSD-2-Clause"

PV = "2.15"

RPM_NAME = "ykclient-2.15-1.37.aarch64.rpm"
RPM_HASH = "82b24315e48fc3a8b28e7490cdbea484035dee00dc47d1e3eda8dd354936c378ebcf2bc75754330d7d40bb687d4c555a906844662496ca50e99ac30ab8e05823"

RPROVIDES:${PN} += "ykclient \
yubico-c-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libykclient.so.3 \
libykclient3"

inherit rpm
