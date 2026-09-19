SUMMARY = "Shared library for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the shared library."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey3-3.8-1.14.aarch64.rpm"
RPM_HASH = "4b3398fd2bf16aa28733d4e79daae2a95261cece81a0b21551139a932c60e41fac0f3547f8158088e2748195a677eeacffb9e728ca135af96dd5297a7f897a30"

RPROVIDES:${PN} += "libnitrokey.so.3 \
libnitrokey3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-libusb.so.0 \
libnitrokey-udev \
libstdc++.so.6"

inherit rpm
