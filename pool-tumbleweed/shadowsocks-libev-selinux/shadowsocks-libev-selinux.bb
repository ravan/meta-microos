SUMMARY = "Selinux support for shadowsocks-libev"
DESCRIPTION = "This package adds SELinux enforcement to shadowsocks-libev."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.6"

RPM_NAME = "shadowsocks-libev-selinux-3.3.6-3.3.noarch.rpm"
RPM_HASH = "20d545bf7e83d00e90f7cfdfd6ba3d9ff0eadff5ef4104209b77a34794021ada07a4ac7e3280350a05b59956346e6d95f18d70e6f4b37ed8665ddc80161f0906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shadowsocks-libev-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy-targeted \
shadowsocks-common-selinux \
shadowsocks-libev"

inherit rpm
