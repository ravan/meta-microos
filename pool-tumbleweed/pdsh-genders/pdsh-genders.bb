SUMMARY = "Genders plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on by genders attributes."
LICENSE = "GPL-2.0-or-later"

PV = "2.36"

RPM_NAME = "pdsh-genders-2.36-1.2.aarch64.rpm"
RPM_HASH = "6d3a02b7aa674f9c154795927ccafeb9cb03230a9dcc4f3ea90c229e72e75bce36f0ef8eb83528f6433d080b485257eebecb2bda26a1efcf0e442b6a24f47458"

RPROVIDES:${PN} += "pdsh-genders"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
pdsh"

inherit rpm
