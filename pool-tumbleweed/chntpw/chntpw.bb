SUMMARY = "Offline NT Password and Registry Editor"
DESCRIPTION = "A utility to reset the password of any user that has a valid local account on your Windows system. \
Supports all Windows from NT3.5 to Win8.1, also 64 bit and also the Server versions (like 2003, 2008, 2012) \
You do not need to know the old password to set a new one. \
It works offline, that is, you have to shutdown your computer and boot off a CD or USB disk to do the password reset. \
Will detect and offer to unlock locked or disabled out user accounts. \
There is also a registry editor and other registry utilities that works under linux/unix, and can be used for other things than password editing."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.0"

RPM_NAME = "chntpw-1.0-3.9.aarch64.rpm"
RPM_HASH = "cd05b5b474fc6f0d34bffc7938f9d7acaa69a65a1aa9e2a63500479233fa30b218aaab6e273ae8ddf213c637dc9f4b47076b8341bdc59a8d8d25b9e68fc13b53"

RPROVIDES:${PN} += "chntpw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
