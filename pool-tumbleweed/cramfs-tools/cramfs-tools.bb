SUMMARY = "Tools for CramFs (Compressed ROM File System)"
DESCRIPTION = "This package contains tools that let you construct a CramFs \
(Compressed ROM File System) image from the contents of a given \
directory, as well as checking a constructed CramFs image and \
extracting its contents."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "cramfs-tools-2.1-2.9.aarch64.rpm"
RPM_HASH = "51d12832594a5a9ab834da6d084ffa3e000a89ce9f91ba6223e64d4db35912b27b6b213660b6f8948caab3f52ef96e21e8b76d386ea4b7ceb5a221b12303950a"

RPROVIDES:${PN} += "cramfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
