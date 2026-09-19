SUMMARY = "Library to mount crypto images and handle key files"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.22"

RPM_NAME = "libcryptmount0-2.22-1.5.aarch64.rpm"
RPM_HASH = "bc4c6eb18aa2a6365c05ac5d2461450f13e649d8fcf1495f15502491c84f968090885bb4745b8432456ba6a16b39c75efe3f4e042b353a0a9db769a8d671a991"

RPROVIDES:${PN} += "libcryptmount.so.0 \
libcryptmount0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6 \
libcrypto.so.3 \
libcryptsetup.so.12"

inherit rpm
