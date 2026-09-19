SUMMARY = "Library for listing information about files opened by process"
DESCRIPTION = "This package contains a library for listing information about files opened by process. \
It allows accessing the functionality of the lsof command from C functions without \
spawning a subprocess. \
 \
This package contains the files required to build with liblsof."
LICENSE = "Zlib"

PV = "4.99.7"

RPM_NAME = "lsof-devel-4.99.7-1.3.aarch64.rpm"
RPM_HASH = "af6bd9cf62550908287f518e9aa6039659b67c9419b0f8ac41dfb45e81280e56fed178c444176bbd1e843505a3d045327efb6c89d398e8ae856c51f20769fa54"

RPROVIDES:${PN} += "lsof-devel"

RDEPENDS:${PN} += "liblsof0"

inherit rpm
