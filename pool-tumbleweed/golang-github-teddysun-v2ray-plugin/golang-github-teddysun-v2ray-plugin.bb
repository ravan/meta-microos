SUMMARY = "Additional mobile libraries"
DESCRIPTION = "Yet another SIP003 plugin for shadowsocks, based on v2ray \
 \
This package provide source code for shadowsocks-v2ray-plugin"
LICENSE = "MIT"

PV = "5.49.0"

RPM_NAME = "golang-github-teddysun-v2ray-plugin-5.49.0-1.4.noarch.rpm"
RPM_HASH = "22e1fd8d30e86017c956bab2450e8a040a23997620734897490b6f4ea162dab59e8047b1ed0eaef7a561b20fe01a1161b35ff1ecdba959800a2d5c20cccc9e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-teddysun-v2ray-plugin"

RDEPENDS:${PN} += ""

inherit rpm
