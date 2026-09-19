SUMMARY = "Manage 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, used for \
platform NVDIMM resources like those defined by the ACPI 6.0 NFIT \
(NVDIMM Firmware Interface Table)."
LICENSE = "GPL-2.0-only"

PV = "84"

RPM_NAME = "ndctl-84-1.2.aarch64.rpm"
RPM_HASH = "d12a567bae00c0f841a68e63b846a364389a715dd5667fb57fade896184ae1f8c265a8c5fb4d41047cc91254eaabe71ab24be1c0c2081fca83f7e77765595790"

RPROVIDES:${PN} += "config-ndctl \
ndctl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxl.so.1 \
libdaxctl.so.1 \
libiniparser.so.4 \
libjson-c.so.5 \
libkeyutils.so.1 \
libndctl.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libuuid.so.1 \
systemd"

inherit rpm
