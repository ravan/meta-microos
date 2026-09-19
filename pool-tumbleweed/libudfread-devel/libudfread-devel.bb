SUMMARY = "UDF Reader Library - Development files"
DESCRIPTION = "Development files for libudfread."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libudfread-devel-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "d42f5b289ffcb0906b0b9ff5d41141ebc2e425dc2cf2e1d8aaa6464e7d11271dba4d19360c848e6655e52d02ba033922f868a5f020d88bcaa58eac0d33d30962"

RPROVIDES:${PN} += "libudfread-devel \
pkgconfig-libudfread"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libudfread3"

inherit rpm
