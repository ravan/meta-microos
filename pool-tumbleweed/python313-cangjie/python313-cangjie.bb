SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python313-cangjie-1.3-3.12.aarch64.rpm"
RPM_HASH = "3c28a8cc9aca2da445f854b652782f5d3ea1ba6a45fe9a3bf29266efbe4dbeccf105c29300904ebcddb51b3dd3c6f14cde22dce03a4a3c72100882ca6bbe5b64"

RPROVIDES:${PN} += "python3-cangjie \
python313-cangjie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie-data \
libcangjie.so.2 \
python-abi"

inherit rpm
