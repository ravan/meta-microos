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

RPM_NAME = "python314-openwrt-luci-rpc-1.1.17-2.5.noarch.rpm"
RPM_HASH = "3834f3f39d90f03eed5283ae36c1af1440eab53b5619f0d2e581d7f1f38bf865a8eaac0f6f265e3034231fde6699e0b7f79add2ba67959933c85d90b8cdd2d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openwrt-luci-rpc \
python314-openwrt-luci-rpc \
python3dist-openwrt-luci-rpc"

RDEPENDS:${PN} += "python-abi \
python314-click \
python314-packaging \
python314-requests"

inherit rpm
