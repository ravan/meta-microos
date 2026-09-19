SUMMARY = "Shared library files for llhttp library"
DESCRIPTION = "Port of http_parser to llparse \
 \
This package contains the dynamically linked library."
LICENSE = "MIT"

PV = "9.3.1"

RPM_NAME = "libllhttp9_3-9.3.1-1.3.aarch64.rpm"
RPM_HASH = "09de2a8b218a356516e03cb5a36f5f3962c342a95917868fd361e8f3b773cf2751ac0417518a92a09d17cb10ade8ceacef29415ddb5d24c2cd4519821cbc5d48"

RPROVIDES:${PN} += "libllhttp.so.9.3 \
libllhttp9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
