SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-watchfiles-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "ce52720e45daa055281bf2c46e45887a4d01f1cf85af1e782ef1779795e68560b3808463428b57a0907b78ddc201f37abcdbf0ffa5bb78ce01d09801ef928d57"

RPROVIDES:${PN} += "python3.14dist-watchfiles \
python314-watchfiles \
python3dist-watchfiles"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-anyio"

inherit rpm
