SUMMARY = "Files for LSI MegaRAID support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-megaraid-plugin package contains the plugin for LSI MegaRAID \
storage management via storcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-megaraid-plugin-1.10.3-1.3.noarch.rpm"
RPM_HASH = "2d40b1ed36dcf215f3bba3332be1b7eacdb7d89ccdc2670cb03f7484384c657049fdb986e659465fb206071d2f2e424d77aff2b2fd45e6f6e2e7bc926a6d439e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-megaraid-plugin \
libstoragemgmt-megaraid-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
