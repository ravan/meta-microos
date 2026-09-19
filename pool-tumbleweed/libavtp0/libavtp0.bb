SUMMARY = "Audio Video Transport Protocol (AVTP) Support Library"
DESCRIPTION = "An implementation of Audio Video Transport Protocol (AVTP) as specified \
in IEEE 1722-2016."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libavtp0-0.2.0-2.11.aarch64.rpm"
RPM_HASH = "be3bf6b0dd30d12a23a1e0c7b56c5bde7fac7f0807949bf0eb8ab003e3ea1b22dbfeb3eb67adf4c885bcb3ece49f7e5c631d6d94d239078b27245810d8686cb7"

RPROVIDES:${PN} += "libavtp.so.0 \
libavtp0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
