SUMMARY = "Development files for libcint"
DESCRIPTION = "The libcint-devel package contains libraries and header files for \
developing applications that use libcint."
LICENSE = "BSD-2-Clause"

PV = "6.1.3"

RPM_NAME = "cint-devel-6.1.3-1.3.aarch64.rpm"
RPM_HASH = "3319f9f256257dae23bdc1262b6487d085e9ff1b435153bb4653f85a977875860041a30de368e73a0af853fa69897603cdb890862e0bf54dbd0058d6e0496e7b"

RPROVIDES:${PN} += "cint-devel"

RDEPENDS:${PN} += "libcint6"

inherit rpm
