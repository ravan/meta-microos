SUMMARY = "Windows guest support in libguestfs"
DESCRIPTION = "Provides the needed pieces for libguestfs to handle Windows guests."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-winsupport-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "0f7890d6b398ca74fdb45d7382c80708d98dd574f89c0b57bca11381d5860d9e3a303f2ead667a93d04723e75241790fe7b02971990bd040a055ac5d4161f34f"

RPROVIDES:${PN} += "guestfs-winsupport \
libguestfs-winsupport"

RDEPENDS:${PN} += "libguestfs \
ntfs-3g \
ntfsprogs"

inherit rpm
