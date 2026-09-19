SUMMARY = "Dsh plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes from dsh-style 'group' files"
LICENSE = "GPL-2.0-or-later"

PV = "2.36"

RPM_NAME = "pdsh-dshgroup-2.36-1.2.aarch64.rpm"
RPM_HASH = "91d17b351bdd56b061ba05dd09af8f124e570dedb6fc138a817988453bb1173e91a8340459c430f89acf164a7af17056b02171c7c63e873f05bb30eaed06a9b9"

RPROVIDES:${PN} += "pdsh-dshgroup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pdsh"

inherit rpm
