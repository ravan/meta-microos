SUMMARY = "Development Environment for weechat Plugins"
DESCRIPTION = "Development environment for authoring weechat plugins."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-devel-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "27dcdec171f1fbae26f5402d351fc5f484032bc3ad77b3a57f4bee96c80a1da00567d243ebff8d49120f3795f834e6494a3c4de387b22b3aa07a05c431c30343"

RPROVIDES:${PN} += "pkgconfig-weechat \
weechat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
weechat"

inherit rpm
