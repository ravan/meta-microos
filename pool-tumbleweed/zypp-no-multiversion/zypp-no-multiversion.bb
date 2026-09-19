SUMMARY = "Don't install multiple packages in parallel"
DESCRIPTION = "This package installs a zypp.conf snippet to disable multiversion \
settings. This is normally used to install the kernel in different \
versions at the same time, but not necessary with snapshots or \
transactional-update."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "zypp-no-multiversion-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "48ef8b741ac599d111d000cd43fb7625abf313286d7de65b60cb4c7e83f51dcd511289c4989317dc220576a7a31de6c7d1c8b680252f1ac33ba8cf0663ff436a"

RPROVIDES:${PN} += "zypp-no-multiversion"

RDEPENDS:${PN} += "libzypp-econf"

inherit rpm
