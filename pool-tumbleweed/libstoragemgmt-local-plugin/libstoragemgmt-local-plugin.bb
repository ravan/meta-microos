SUMMARY = "Files for HP local pseudo support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-local-plugin package contains the plugin for local pseudo \
storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-local-plugin-1.10.3-1.3.noarch.rpm"
RPM_HASH = "e166a7db1075ae1edecda3087a474a586e3c446da3f34b2c28d3dd110b8d838b603ae06ca57cbac7f7c36c93537c9e498c4a320d829e73c3459ef312c2bbf694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-local-plugin \
libstoragemgmt-local-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
