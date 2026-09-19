SUMMARY = "SystemTap headers"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains only the headers for static system probes and \
exists only to limit build cycles.  Normally you should install \
systemtap-sdt-devel, which also contains these headers."
LICENSE = "GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "systemtap-headers-5.5-1.2.aarch64.rpm"
RPM_HASH = "438a9e3ebd012e065eceab07a497cddcf6ae3c663e9e84ed34ab9901d95ddc1af52827004613dd87c46be92667e65b8915adfa16c1e7316152f49cf92749273b"

RPROVIDES:${PN} += "systemtap-headers"

RDEPENDS:${PN} += ""

inherit rpm
