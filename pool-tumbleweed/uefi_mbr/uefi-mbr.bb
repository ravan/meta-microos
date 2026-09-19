SUMMARY = "MBR loader that just prints a message."
DESCRIPTION = "MBR loader that just prints a message for use in UEFI only \
appliances"
LICENSE = "BSD-3-Clause"

PV = "0+git20221129.53aad69"

RPM_NAME = "uefi_mbr-0+git20221129.53aad69-1.9.aarch64.rpm"
RPM_HASH = "707eb5f806849d99ed509661496110d856654ec0a50b9fd06d62c27a33234b59c6970441637b3bc4c166a65e3bc9b26e0d1be6793f6db54ef881f2ce2774e071"

RPROVIDES:${PN} += "uefi-mbr"

RDEPENDS:${PN} += ""

inherit rpm
