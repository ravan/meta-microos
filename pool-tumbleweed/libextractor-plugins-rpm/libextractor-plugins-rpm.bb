SUMMARY = "The 'rpm' libextractor plugin"
DESCRIPTION = "This package ships the 'rpm' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-rpm-1.14-1.2.aarch64.rpm"
RPM_HASH = "4f7b0ab83eb0736b99ccebc0e31775d7e0222eb9281e6fa44bc92384431fdc2db76e473c1ac161aa6ed744302b0d468eb3b42c62c24563a0f0cc532dc934adff"

RPROVIDES:${PN} += "libextractor-plugins-rpm \
libextractor-rpm.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.10"

inherit rpm
