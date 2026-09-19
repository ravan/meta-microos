SUMMARY = "A simple calculator for the Pantheon Desktop"
DESCRIPTION = "A tiny, simple calculator written in GTK+ and Vala."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "pantheon-calculator-8.0.1-1.4.aarch64.rpm"
RPM_HASH = "05c27de67bbd6b8d7c6e4f3eb3c94a16f73e7d7cea3c7ef12fde166e88fda4170ddc4f38f28e7ac2023e9d228cc677561198fdd5f4382f5450a50d447f987e44"

RPROVIDES:${PN} += "elementary-calculator \
pantheon-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libm.so.6"

inherit rpm
