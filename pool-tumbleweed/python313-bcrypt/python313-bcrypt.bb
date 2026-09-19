SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python313-bcrypt-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "b7c6bb75cdba09b253c76c2f457b3b43d3e4e5a8282ead100f8bed266f3beab1d4932893dfd8f6a67cba34b41fc85aca8beefb68df3571d0c138b47c7b3c0d3a"

RPROVIDES:${PN} += "python3-bcrypt \
python3-py-bcrypt \
python3.13dist-bcrypt \
python313-bcrypt \
python313-py-bcrypt \
python3dist-bcrypt"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
