SUMMARY = "Utility to control X server access"
DESCRIPTION = "xhost is used to manage the list of host names or user names \
allowed to make connections to the X server."
LICENSE = "MIT"

PV = "1.0.10"

RPM_NAME = "xhost-1.0.10-1.7.aarch64.rpm"
RPM_HASH = "ac31ee09f9f14322cffd03276825c3482255776ad3c0b0e9a018f6a0002012a47d47888fedd80742bce95170dceae6b2713ea63b1b0d01f7d342f48871eb4a9e"

RPROVIDES:${PN} += "xhost"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
