SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python314-cangjie-1.3-3.12.aarch64.rpm"
RPM_HASH = "e1fcae23b93956f767aa32cc914d9a1f46d6973bab9c0ecb5a792eb4c89868d625c53e1a50e3a053f8ea81403be6c1c35098afc6d0fbed089a11120516edc337"

RPROVIDES:${PN} += "python314-cangjie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie-data \
libcangjie.so.2 \
python-abi"

inherit rpm
