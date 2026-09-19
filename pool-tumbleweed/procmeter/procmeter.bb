SUMMARY = "Utility to display current system parameters"
DESCRIPTION = "With procmeter, one can display various system parameters, e.g. \
processor load, network load, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6+svn415"

RPM_NAME = "procmeter-3.6+svn415-3.11.aarch64.rpm"
RPM_HASH = "1edbe24c5ba17bf131e809da7e8cad02579819c353adf6962fe5ef9f9b2fd8346b6ec25005d9397937aeff2edfd4dfe41ed7d65b68e907cbb7cf0e38b90194bb"

RPROVIDES:${PN} += "libsensors-fan.so \
libsensors-temp.so \
libsensors-volt.so \
procmeter \
procmtr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsensors.so.4"

inherit rpm
