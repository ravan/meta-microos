SUMMARY = "Module for interacting with OpenWrt Luci RPC interface"
DESCRIPTION = "Module for interacting with OpenWrt Luci RPC interface. You need to have 'luci-mod-rpc' \
installed on your openwrt based router. \
 \
-  Allows you to use the Luci RPC interface to fetch connected devices \
   on your OpenWrt based router. \
-  Supports 15.X & 17.X & 18.X or newer releases of OpenWrt. \
 \
https://openwrt-luci-rpc.readthedocs.io"
LICENSE = "Apache-2.0"

PV = "1.1.17"

RPM_NAME = "python313-openwrt-luci-rpc-1.1.17-2.5.noarch.rpm"
RPM_HASH = "b42215875e311f370af80c7d6834a8dc5a430f007096719644add1f4b902a7b806ac3ff376398ff336263f03f4854c2394ec8a5696c4074400b780739ea3e6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openwrt-luci-rpc \
python3.13dist-openwrt-luci-rpc \
python313-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python313-click \
python313-packaging \
python313-requests"

inherit rpm
