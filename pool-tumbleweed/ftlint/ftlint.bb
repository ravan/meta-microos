SUMMARY = "Simple font tester"
DESCRIPTION = "Simple font tester \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftlint-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "977482d45397dafab4787271b54730accba4eb52b69d4d5e18af42d0987b3d2b9994790edd084767cbe57d97e8f7fee0f29e62be775ee7daa73f231cfc33a59d"

RPROVIDES:${PN} += "ftlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
