SUMMARY = "Shdowsocks Daemon System User"
DESCRIPTION = "Shdowsocks Daemon System User."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "shadowsocks-sysuser-1.0.0-1.3.noarch.rpm"
RPM_HASH = "e24be6a53cd14d9354dcd0f7cc15073c7b0d7dbb04978352553a03f33d28c7a48d6d8c0ddbea54b284cb49934d29f9d8f2cc460aa9fa3ce58ca3d53d72ed170d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-shadowsocks \
shadowsocks-sysuser \
user-shadowsocks"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
