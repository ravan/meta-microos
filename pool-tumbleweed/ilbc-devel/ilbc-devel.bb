SUMMARY = "Libraries and Header Files to Develop Programs with iLBC Support"
DESCRIPTION = "Libraries and Header Files to Develop Programs with iLBC Support."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "ilbc-devel-3.0.4-1.5.aarch64.rpm"
RPM_HASH = "6c7b6a1bd188ab69302cd0b42b8cb47ef55905b36872cde65307d614778e5fe5d22fe14152a334e1e8c4d49715488fc80d11c7b270d1b865ee835dcadc0c5e17"

RPROVIDES:${PN} += "ilbc-devel \
pkgconfig-libilbc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libilbc.so.3 \
libilbc3"

inherit rpm
