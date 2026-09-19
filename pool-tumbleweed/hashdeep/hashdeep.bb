SUMMARY = "Compute MD5, SHA-1, SHA-256, Tiger or Whirlpool message digests"
DESCRIPTION = "hashdeep is a program to compute, match, and audit hashsets. \
md5deep computes the MD5, SHA-1, SHA-256, Tiger, or Whirlpool message digest \
for any number of files while optionally recursively digging through the \
directory structure. md5deep can also match input files against lists of known \
hashes in a variety of formats."
LICENSE = "SUSE-Public-Domain & GPL-2.0-or-later"

PV = "4.4"

RPM_NAME = "hashdeep-4.4-5.20.aarch64.rpm"
RPM_HASH = "042adb56312a1374ede9398e25de173d17248530625e91b9627b4b3ea84456f7bfbc51ed00f3ff7172463b10e0ea922d88dbcfd29a09a698fa0fec7459e068bd"

RPROVIDES:${PN} += "hashdeep \
md5deep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
