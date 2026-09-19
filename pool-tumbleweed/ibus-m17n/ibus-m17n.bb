SUMMARY = "The M17N engine for IBus platform"
DESCRIPTION = "M17N engine for IBus input platform. It allows input of many languages using \
the input table maps from m17n-db."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.37"

RPM_NAME = "ibus-m17n-1.4.37-1.4.aarch64.rpm"
RPM_HASH = "1044a5f2faf9b056cf9b5d771c7945a25b3c194f2105950cff278e3f5cd07bf925ab1a05f7712e37bff02cfccef388b1855bfd98c57e807cbe156bbdda1b4b91"

RPROVIDES:${PN} += "ibus-m17n \
locale-ibus-am;ar;as;bn;fa;gu;he;hi;ja;ka;kk;kn;ko;lo;ml;my;ur;ru;vi;zh"

RDEPENDS:${PN} += "ibus \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libibus-1.0.so.5 \
libm17n-core.so.0 \
libm17n.so.0"

inherit rpm
