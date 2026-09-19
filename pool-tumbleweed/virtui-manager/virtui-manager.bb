SUMMARY = "Terminal-based interface to manage virtual machines using libvirt"
DESCRIPTION = "Virtui-manager is a terminal-based interface to manage virtual machines using libvirt. \
It allows you to view VM status, start/stop/pause VMs, and access consoles."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "virtui-manager-3.2.1-1.1.noarch.rpm"
RPM_HASH = "98d87fadbabc00556536a05f9d0deddb2cedec1d66994a82cfd2779f0381d7b8bf218cc86d9e8ba004a8d03c20ce9d3320b861ce03e5689855de24a02d782e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-virtui-manager \
python3dist-virtui-manager \
virtui-manager"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
7zip \
python-abi \
python3-PyYAML \
python3-libvirt-python \
python3-linkify-it-py \
python3-markdown-it-py \
python3-netifaces \
python3-textual \
tmux"

inherit rpm
