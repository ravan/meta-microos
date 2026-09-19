SUMMARY = "SIP003 plugin for shadowsocks"
DESCRIPTION = "Yet another SIP003 plugin for shadowsocks, based on v2ray"
LICENSE = "MIT"

PV = "5.49.0"

RPM_NAME = "shadowsocks-v2ray-plugin-5.49.0-1.4.aarch64.rpm"
RPM_HASH = "64a0faae61c3386085552800a6c2ed76988b68abdeb9d7fd654cba11c2008c9f75ac78b79900d74a260ec295168c7fa459108360bbde02edf598babb70866f54"

RPROVIDES:${PN} += "shadowsocks-v2ray-plugin"

RDEPENDS:${PN} += ""

inherit rpm
