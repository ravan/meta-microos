SUMMARY = "Files for HP SmartArray support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-hpsa-plugin package contains the plugin for HP SmartArray storage \
management via hpssacli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-hpsa-plugin-1.10.3-1.3.noarch.rpm"
RPM_HASH = "70da686019e330d1f507a37ecaabb255810aa66fd32e79acbac794f311589f38db2f2fd98d7a856cd4f36cfce894203b4459c795dd62c5985176fc76484f5932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-hpsa-plugin \
libstoragemgmt-hpsa-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
