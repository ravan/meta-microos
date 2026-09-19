SUMMARY = "NVMe STorage Appliance Services"
DESCRIPTION = "nvme-stas is a Central Discovery Controller (CDC) client for Linux. It \
handles Asynchronous Event Notifications (AEN) handling, Automated, \
NVMe subsystem connection controls, Error handling and reporting and \
Automatic (zeroconf) and Manual configuration."
LICENSE = "Apache-2.0"

PV = "3.0"

RPM_NAME = "nvme-stas-3.0-1.1.noarch.rpm"
RPM_HASH = "3b864d0c87e96c8cca0d06f699c126b9ab2513cde93987f55f7609ab213370e69e1b73a939e546a5bcd69b303a35513b2b02f5f221a326236bb8d0a970f869e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-nvme-stas \
nvme-stas"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
avahi \
nvme-cli \
python-abi \
python3-dasbus \
python3-gobject \
python3-libnvme3 \
python3-pyudev \
python3-systemd \
typelib-GLib \
typelib-GObject \
typelib-Gio \
util-linux"

inherit rpm
