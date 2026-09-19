SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python314-bcrypt-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "a24d44d25c7ec95f6626206131f24532276007c1ee13ef96e5d7ac80e6fb2d2a2a9df395a7472f4e012e880416424f0e96b34ae3e8eca12009adac2754b59833"

RPROVIDES:${PN} += "python3.14dist-bcrypt \
python314-bcrypt \
python314-py-bcrypt \
python3dist-bcrypt"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
