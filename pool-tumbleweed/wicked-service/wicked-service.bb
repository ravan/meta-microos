SUMMARY = "Network configuration infrastructure - systemd service"
DESCRIPTION = "Wicked is a network configuration infrastructure incorporating a number \
of existing frameworks into a unified architecture, providing a DBUS \
interface to network configuration. \
 \
This package provides the wicked systemd service files."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.80"

RPM_NAME = "wicked-service-0.6.80-2.1.aarch64.rpm"
RPM_HASH = "8035411bf7c5eb5a109bad446f21eb7c15b1c7ccf6b0ae629ad25447b10ff77d1ee8f919a261069235aad05280ef42b65ffbcb8ac92f16b5f9132da5625d7f5f"

RPROVIDES:${PN} += "/sbin/ifup \
service-network \
sysvinit-network \
wicked-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
sysconfig \
wicked"

inherit rpm
