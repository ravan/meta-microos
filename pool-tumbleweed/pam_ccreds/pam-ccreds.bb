SUMMARY = "Pam module to cache login credentials"
DESCRIPTION = "The pam_ccreds module provides the means for Linux workstations to \
locally authenticate using an enterprise identity when the network is \
unavailable. Used in conjunction with the nss_updatedb utility, it \
provides a mechanism for disconnected use of network directories."
LICENSE = "GPL-2.0-or-later"

PV = "10"

RPM_NAME = "pam_ccreds-10-27.19.aarch64.rpm"
RPM_HASH = "1fdf5712d327f8853c53bf565adc46c080d4ba9b10b4f9c442af017fc52c6037c1a4626c999abd378a2ed35b44cd75c8c166ddb790b1519c1a99734656559903"

RPROVIDES:${PN} += "pam-ccreds"

RDEPENDS:${PN} += "db \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libpam-misc.so.0 \
libpam.so.0 \
pam"

inherit rpm
