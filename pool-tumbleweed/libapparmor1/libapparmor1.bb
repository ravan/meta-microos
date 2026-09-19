SUMMARY = "Utility library for AppArmor"
DESCRIPTION = "This package provides the libapparmor library, which contains the \
change_hat(2) symbol, used for sub-process confinement by AppArmor, as \
well as functions to parse AppArmor log messages."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "libapparmor1-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "67f84fe977fad9bbe35578caabf3091c936405979bf0a8133332d1b68f1fd509c77cf51ba4224a08804fcc6f183d06cf1d128d4fdf79e5d3b2c3e74ad336bf66"

RPROVIDES:${PN} += "libapparmor \
libapparmor.so.1 \
libapparmor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
