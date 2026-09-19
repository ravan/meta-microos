SUMMARY = "DEPRECATED: Hmland and utilities to use the HM-CFG-USB(2)"
DESCRIPTION = "DEPRECATED: This package contains, amongst others, hmland an application, which emulates the \
HomeMatic LAN configuration adapter-protocol to make it possible to use the \
HM-CFG-USB in Fhem or as a lan configuration tool for the CCU or the \
HomeMatic windows configuration software, also supporting devices using \
AES-signing like KeyMatic."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "0.103+git23.g7157286"

RPM_NAME = "hmcfgusb-0.103+git23.g7157286-2.8.aarch64.rpm"
RPM_HASH = "957e472070e43832c480e3cd840bb8c8a80f300dddf9f6caf917d385fbd3d1aa9f01ac2efb44e2a957731fb7b0f269c300560e2d0502e13326c832f705f64616"

RPROVIDES:${PN} += "config-hmcfgusb \
hmcfgusb"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
libusb-1.0.so.0 \
logrotate"

inherit rpm
