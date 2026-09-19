SUMMARY = "Files for targetd array support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-targetd-plugin package contains plug-in for targetd \
array support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-targetd-plugin-1.10.3-1.3.noarch.rpm"
RPM_HASH = "403aa2e59b333ce7f266ab72c13631945e9272fb7c804d367c22377f002963f8c4e9103ae5608d302f87f04f42edc96d05881979cde048e1e2b6cdb44118aee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstoragemgmt-targetd-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
