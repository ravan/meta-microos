SUMMARY = "Selinux support for shadowsocks-libev and shadowsocks-common"
DESCRIPTION = "This package adds SELinux common enforcement to shadowsocks-libev and \
shadowsocks-common"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "shadowsocks-common-selinux-1.0.0-1.3.noarch.rpm"
RPM_HASH = "e7365654e7634ac295a0152d64490e8913e96b5feb18d5cf252435da9f779994ac7648dd6a6caf60b7547b0b98d2893a058d5fc15feb842e1de774c396f83d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shadowsocks-common-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
selinux-policy-targeted \
shadowsocks-common"

inherit rpm
