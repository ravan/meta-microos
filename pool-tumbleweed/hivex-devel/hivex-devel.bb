SUMMARY = "Development files for hivex"
DESCRIPTION = "Development files for hivex. Hivex is a Windows Registry Hive extraction \
library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "hivex-devel-1.3.24-3.3.aarch64.rpm"
RPM_HASH = "30d8bfc30088a7fe0246911c739b943b9d0f1220df4bf8a9cd47aca77e053e052473054680f79a60edad7907d2a8d46308b7fadc0485c2aedea477602142cac4"

RPROVIDES:${PN} += "hivex-devel \
pkgconfig-hivex"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhivex0"

inherit rpm
