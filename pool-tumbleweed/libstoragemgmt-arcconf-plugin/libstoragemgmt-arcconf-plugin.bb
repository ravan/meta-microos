SUMMARY = "Files for Microsemi storage support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-arcconf-plugin package contains the plugin for Microsemi \
storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-arcconf-plugin-1.10.3-1.3.noarch.rpm"
RPM_HASH = "a3e73fa1283a1a6a9beabb79a4fc6d016c9f53ad40f26e0fab7b4e7cf31e0e595bb467b9e8c42f05e957d9494692af3164f358c18795d8732d4991a5a1971190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-arcconf-plugin \
libstoragemgmt-arcconf-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
