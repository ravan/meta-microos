SUMMARY = "AdPlug Database Maintenance Utility"
DESCRIPTION = "adplugdb maintains database files in AdPlug database format. It can add, list \
and remove records within a central database, or merge a set of databases \
together into one single database."
LICENSE = "LGPL-2.1-only"

PV = "2.4"

RPM_NAME = "adplugdb-2.4-1.7.aarch64.rpm"
RPM_HASH = "4d745d1a04c4dd3de1fd0fffefd9e41b2a5082aceb6a1911c4a3fef551209690d2a41ef77a2eb603290886c6712f9097a04ed22f3fb7a9e3541d3781bfc81115"

RPROVIDES:${PN} += "adplugdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadplug-2.4.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
