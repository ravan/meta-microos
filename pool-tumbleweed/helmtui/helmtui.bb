SUMMARY = "A simple terminal UI for Helm"
DESCRIPTION = "Helmtui is a terminal-based UI application to manage your Helm releases, \
charts, repositories, and plugins with ease. \
 \
Features \
 \
* Manage Helm releases effortlessly. \
* Add, update, and remove Helm repositories."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "helmtui-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "f4c289da254780e4e0ab0bd4820d7b4770b35c12e5135ca47c8ea7b27931bc32bb598391ada89a429ecacf50072bec99b6361e6b4678b1b43ee4e29dc98ed45c"

RPROVIDES:${PN} += "helmtui"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
