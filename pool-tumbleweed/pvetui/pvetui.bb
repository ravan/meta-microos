SUMMARY = "Terminal UI for Proxmox VE"
DESCRIPTION = "A Terminal User Interface For Proxmox Virtual Environment"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "pvetui-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "aa77880ebb80e255cfd2717581544a1eeee05389e9cf00da2bc48ff06dc08b9fee9565bc83cbb83bbb6a4971a56013ca42b9f7bafeec93dfab5075674ffef344"

RPROVIDES:${PN} += "pvetui"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
