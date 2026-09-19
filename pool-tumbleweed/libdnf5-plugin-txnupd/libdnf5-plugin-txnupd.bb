SUMMARY = "Plugin for libdnf5 to implement transactional updates"
DESCRIPTION = "This package contains the plugin to implement transactional updates \
as a libdnf plugin. This plugin hooks into libdnf5 for DNF and \
PackageKit to enable this functionality in normal use."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libdnf5-plugin-txnupd-0.3.0-2.2.aarch64.rpm"
RPM_HASH = "21647e829faea5aa3a5a733d8292245c800beb32ef941f48fd5cb8667b5db2b7c23d7f6a876564025afd460be8e4c4d9c4b5bcfddae9f1b336d58268f1a50ba8"

RPROVIDES:${PN} += "libdnf-plugin-txnupd \
libdnf5-plugin-txnupd"

RDEPENDS:${PN} += "dnf-data \
dracut-transactional-update \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtukit.so.8 \
libtukit8"

inherit rpm
