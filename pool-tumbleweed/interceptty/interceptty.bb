SUMMARY = "Serial port sniffer"
DESCRIPTION = "IntercepTTY is a program that can sit between a real (or fake) \
serial port and an application, recording any communications \
between the application and the device. It can also be used as a \
network serial server or client, to provide an emulated serial port \
connected to a program, and for various other tasks."
LICENSE = "GPL-2.0-only"

PV = "0.6+git.20190731"

RPM_NAME = "interceptty-0.6+git.20190731-1.20.aarch64.rpm"
RPM_HASH = "d1cb30d69a765b462d4b33a66aef6d8a57cf5f1adeb0bcff31b71cb9cd73399a4e3809a47e11fc2c2f028593bb494e59e07329c30e700dc1cc43947c925dc938"

RPROVIDES:${PN} += "interceptty"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
