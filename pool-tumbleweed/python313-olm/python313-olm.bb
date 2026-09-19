SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python313 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.16"

RPM_NAME = "python313-olm-3.2.16-2.4.aarch64.rpm"
RPM_HASH = "6f1908277012884fc741423ef73be64bb94ce02de8d2b79d6823881b490d1bdb3feb69a21cf069aa91445171c04cd990bd6a131f49a27b81381fedb0af1774b3"

RPROVIDES:${PN} += "python3-olm \
python3.13dist-python-olm \
python313-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python313-cffi"

inherit rpm
