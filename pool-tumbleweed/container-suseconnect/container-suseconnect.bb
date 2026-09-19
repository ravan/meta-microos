SUMMARY = "Provides access to repositories inside containers"
DESCRIPTION = "container-suseconnect gives access to package repositories inside containers \
using the host machine entitlements."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "container-suseconnect-2.6.0-1.1.aarch64.rpm"
RPM_HASH = "b954dc47688d6d34248bcfbaa5967f51f4812846ad814f425075b1f1a0c9758d655d857b51e2486ebcd87d24f11369fa73cb513db973bd082e507879597794e0"

RPROVIDES:${PN} += "container-suseconnect"

RDEPENDS:${PN} += "libc.so.6 \
libzypp"

inherit rpm
