SUMMARY = "Mobile telephony application development framework"
DESCRIPTION = "oFono provides a mobile telephony (GSM/UMTS) application development \
framework. It includes a high-level D-Bus API for use by telephony \
applications, and a low-level plug-in API for integration with other \
stacks, cellular modems, and storage back ends. The plug-in API \
functionality is modeled on public standards, in particular 3GPP TS \
27.007 'AT command set for User Equipment (UE)'."
LICENSE = "GPL-2.0-only"

PV = "2.19"

RPM_NAME = "ofono-2.19-3.3.aarch64.rpm"
RPM_HASH = "63d57f5b64377b7c6eb467085b0461976fc2554c29a5ca654c8edb55adbc84e58fb4391628ececf79c18f54902d52ab51946d499ad9de80dc01de84ca14e11be"

RPROVIDES:${PN} += "config-ofono \
ofono"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libudev.so.1 \
systemd"

inherit rpm
