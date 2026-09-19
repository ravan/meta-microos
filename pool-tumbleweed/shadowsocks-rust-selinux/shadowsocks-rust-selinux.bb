SUMMARY = "Selinux support for shadowsocks-rust"
DESCRIPTION = "This package adds SELinux enforcement to shadowsocks-rust."
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "shadowsocks-rust-selinux-1.24.0-4.3.noarch.rpm"
RPM_HASH = "f94c54c1cbba2540d35ec6a54377026ddd7ff63dbc02a30a4d14fe197fc55241f5a9f80ace1f8a9043f7bfd08d17e51955a7c913e9a54760d412862f13fed4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shadowsocks-rust-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy-targeted \
shadowsocks-common-selinux \
shadowsocks-rust"

inherit rpm
