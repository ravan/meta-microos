SUMMARY = "PAM module for pluggable login authentication for OATH"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
This subpackage contains a module to integrate OATH into PAM."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.14"

RPM_NAME = "pam_oath-2.6.14-1.5.aarch64.rpm"
RPM_HASH = "821ce0206714078f95c35e83ff14d1a752d6c974815d481b2f26e25ab7df1b6063354ed6dde1c2567f873347aea07bbf091219a19da5f02336dedf02b31a37a5"

RPROVIDES:${PN} += "pam-oath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liboath.so.0 \
libpam.so.0"

inherit rpm
