SUMMARY = "Development files for libcryptmount"
DESCRIPTION = "libcryptmount takes care of the many steps involved in making a \
crypto image (file) available as a mountable block device, including \
supplemental key file decryption, loop device setup and crypto device \
setup. It supports pam_mount style plain EHD2/OpenSSL images and LUKS \
and transparent use of the OS's crypto layer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.22"

RPM_NAME = "libcryptmount-devel-2.22-1.5.aarch64.rpm"
RPM_HASH = "e4565e6d595e9de9719557b892024afc835a6cc10b9cd70d220a9716854db7a5df33270d4f587260cd9db7a29ae0d56d880fa932ffb30b8b2059c798f69ed774"

RPROVIDES:${PN} += "libcryptmount-devel \
pkgconfig-libcryptmount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptmount0"

inherit rpm
