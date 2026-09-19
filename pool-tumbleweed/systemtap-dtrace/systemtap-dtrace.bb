SUMMARY = "SystemTap dtrace utility"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the dtrace utility to build provider and probe \
definitions."
LICENSE = "GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "systemtap-dtrace-5.5-1.2.noarch.rpm"
RPM_HASH = "0f9abaaa8e08d9c8de1a6524db0b7264ec1e678d85434a78c0dd7139c693dbe846aaefc27e397efa282d5d5f569971ef4dbd40bc959a6c35aba9332c1384f0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemtap-dtrace"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
