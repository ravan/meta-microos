SUMMARY = "Shared library of tinygettext"
DESCRIPTION = "This package contains the shared library of tinygettext"
LICENSE = "Zlib"

PV = "0.1.1469459657.bf66a57"

RPM_NAME = "libtinygettext0-0.1.1469459657.bf66a57-3.5.aarch64.rpm"
RPM_HASH = "90ec492e8b294965ab7bcd5b5e69ca628cc57d7865329a500faa85a4f86303c4ac8fd2209d7c8d6d7a70677c63f36b3a6999f022d483a4b389563ff724854eba"

RPROVIDES:${PN} += "libtinygettext.so.0 \
libtinygettext0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
