SUMMARY = "Apparmor profile for shadowsocks-rust"
DESCRIPTION = "This package adds the Apparmor profile to shadowsocks-rust"
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "shadowsocks-rust-apparmor-1.24.0-4.3.noarch.rpm"
RPM_HASH = "f969a5aeddc887dccc535d602591b4493ab80ee15ddbf2f8e24d0aacec089e8a446b75be19e20cf2755a007ac5bfcbba0a0d22f4a38e5f0a009a41c77d3f8cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shadowsocks-rust-apparmor \
shadowsocks-rust-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
shadowsocks-rust"

inherit rpm
