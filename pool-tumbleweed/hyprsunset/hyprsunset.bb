SUMMARY = "Blue light filter application for Hyprland"
DESCRIPTION = "Hyprsunset is an application to enable a blue light filter on Hyprland. \
It works through the hyprland-ctm-control-v1 protocol and requires Hyprland \
version 0.45.0 or newer."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "hyprsunset-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "32dc6082f8b152a7387f052dc8f524e4e7233f833cf4824b43d1dcb5fea970ad8f54d1598ed4d9ec49972cda3df9425b946b04035cf62408ff034aff81280299"

RPROVIDES:${PN} += "hyprsunset"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhyprlang.so.2 \
libhyprutils.so.13 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
systemd"

inherit rpm
