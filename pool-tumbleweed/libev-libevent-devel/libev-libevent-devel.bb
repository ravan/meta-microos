SUMMARY = "Libev libevent compatibility header"
DESCRIPTION = "This package holds the libevent compatibility header from libev."
LICENSE = "BSD-2-Clause"

PV = "4.33"

RPM_NAME = "libev-libevent-devel-4.33-6.5.aarch64.rpm"
RPM_HASH = "9e5aaf6aada912ee6cbd9b7ead38714ddbaaff4a5cd1918eadcca4805efdb8542962560e08da71e1e30a607ef9e2daf4cbe42422c1c3df4d6d8ea8b165c40c0b"

RPROVIDES:${PN} += "libev-libevent-devel"

RDEPENDS:${PN} += "libev4"

inherit rpm
