SUMMARY = "Device driver control utility"
DESCRIPTION = "driverctl is a tool for manipulating and inspecting the system \
device driver choices. \
 \
Devices are normally assigned to their sole designated kernel driver \
by default. However in some situations it may be desireable to \
override that default, for example to try an older driver to \
work around a regression in a driver or to try an experimental alternative \
driver. Another common use-case is pass-through drivers and driver \
stubs to allow userspace to drive the device, such as in case of \
virtualization. \
 \
driverctl integrates with udev to support overriding \
driver selection for both cold- and hotplugged devices from the \
moment of discovery, but can also change already assigned drivers, \
assuming they are not in use by the system. The driver overrides \
created by driverctl are persistent across system reboots \
by default."
LICENSE = "LGPL-2.0-only"

PV = "0.111"

RPM_NAME = "driverctl-0.111-3.7.noarch.rpm"
RPM_HASH = "eacd870bfdd572e8c4344407d84eeaf47793fa6de45b4171e8f8ad8d80d16d370bc99ca59e5c5f91618f37541f01f6d8464c7d681e059d87cd68279ace4fdac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "driverctl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
udev"

inherit rpm
