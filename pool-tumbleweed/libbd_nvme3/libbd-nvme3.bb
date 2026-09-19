SUMMARY = "The NVMe plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides NVMe-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_nvme3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "48061b9e84ad706c436a1218ddfb5105288206ffa8a2ef8580a269e7d1eb68e752be825613a07ee287d04fa67374efd402ae9b9cb8542f7ac9a046f672b7665e"

RPROVIDES:${PN} += "libbd-nvme.so.3 \
libbd-nvme3 \
libblockdev-nvme"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libglib-2.0.so.0 \
libnvme.so.1"

inherit rpm
