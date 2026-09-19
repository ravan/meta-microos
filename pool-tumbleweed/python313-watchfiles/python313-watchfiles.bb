SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-watchfiles-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "608704d90419725ff1762eafd058189528cd377024a859b210467127006c304f4636e03b61b881f1526e982fbb6e3eaea8a3bee4582db86434c0e5c9e602840f"

RPROVIDES:${PN} += "python3-watchfiles \
python3.13dist-watchfiles \
python313-watchfiles \
python3dist-watchfiles"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-anyio"

inherit rpm
