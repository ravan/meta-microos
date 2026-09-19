SUMMARY = "Integrate Cairo into the Glib type system"
DESCRIPTION = "Integrate Cairo into the Glib type system"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "perl-Cairo-GObject-1.5.0-1.9.aarch64.rpm"
RPM_HASH = "eb69ba1c62da76f1ea709c6b6ca34c44f30998558220295ce7ce8db13170b2ecaeec6c5af7e4ed473c8137bc464878716f18952fb11a037f9a990041a53e0233"

RPROVIDES:${PN} += "perl-Cairo--GObject \
perl-Cairo-GObject"

RDEPENDS:${PN} += "libcairo-gobject.so.2 \
libcairo.so.2 \
libglib-2.0.so.0 \
perl--MODULE-COMPAT-5.44.0 \
perl-Cairo \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig \
perl-Glib"

inherit rpm
