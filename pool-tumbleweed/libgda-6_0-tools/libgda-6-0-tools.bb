SUMMARY = "GNU Data Access (GDA) Library -- Tools"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides command-line tools for libgda."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-tools-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "f4c650e2cabf44872eab5ad42c2439363af29b7c6ced9db71d7317953dcef1f2ffae6e1781df87963b8e163a157dcab367cdca3cf7fed85499c7841184a9db9f"

RPROVIDES:${PN} += "libgda-6-0 \
libgda-6-0-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16"

inherit rpm
