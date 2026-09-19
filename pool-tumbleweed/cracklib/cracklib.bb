SUMMARY = "Library to crack passwords using dictionaries"
DESCRIPTION = "CrackLib tests passwords to determine whether they match \
certainsecurity-oriented characteristics. You can use CrackLib to \
stopusers from choosing passwords that are too simple.This package \
contains a full dictionary file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "cracklib-2.9.11-1.11.aarch64.rpm"
RPM_HASH = "a747d1a614b3158dd0014ccb68d842ee15cef026a221ba77839327c1ff9befbeb1da1ede96818fddc2dfd4a9ec3b25007e2c8c7125e80c3bbcf1f0cffb25e6d6"

RPROVIDES:${PN} += "cracklib"

RDEPENDS:${PN} += "/usr/bin/sh \
cracklib-dict \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2"

inherit rpm
