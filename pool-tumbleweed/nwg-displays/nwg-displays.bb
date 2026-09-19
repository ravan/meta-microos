SUMMARY = "Output management utility for sway, Hyprland and Niri"
DESCRIPTION = " \
nwg-displays is an output management utility for the Sway, Hyprland and Niri Wayland compositors, \
inspired by wdisplays and wlay."
LICENSE = "MIT"

PV = "0.4.4"

RPM_NAME = "nwg-displays-0.4.4-1.1.noarch.rpm"
RPM_HASH = "2307eae5bdf4edbfdaef8c12ae07186c2c0a5302902ee4675edaa0d1353da4cd0b87235aae99e0bacb16923b0257532c6c49de6d1e62f322cbfe94ffbb31f37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nwg-displays \
python3.13dist-nwg-displays \
python3dist-nwg-displays"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-gobject \
python3-i3ipc \
typelib-GtkLayerShell"

inherit rpm
