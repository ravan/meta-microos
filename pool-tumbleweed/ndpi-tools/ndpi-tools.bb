SUMMARY = "Tools for nNDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains the ndpiReader binary."
LICENSE = "LGPL-3.0-only"

PV = "4.12"

RPM_NAME = "ndpi-tools-4.12-1.8.aarch64.rpm"
RPM_HASH = "c4737c0ba1728c05c2863a27b9a46e4e31b05378ccf05fb8bdf8aa5956ff145d8cc97eb5f1b3b9bec2ecd84e1bb23570caee0cec40ca87c178f1a12385ef8078"

RPROVIDES:${PN} += "ndpi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcap.so.1"

inherit rpm
