SUMMARY = "libreport's logger reporter plugin"
DESCRIPTION = "The simple reporter plugin which writes a report to a specified file."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-logger-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "2b6d6e2f31bfdb8e1bff4d291623243d91802efcda012eecf2ae08e3bbdbd587e9f4dfa6b9ae55b534086f6df3145df1c5982f86a322f81b939dd0906cb6d3bf"

RPROVIDES:${PN} += "config-libreport-plugin-logger \
libreport-plugin-logger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport.so.2"

inherit rpm
