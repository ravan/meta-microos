SUMMARY = "Integrate Nautilus and E-Mail clients"
DESCRIPTION = "This package provides the functionality to the Nautilus file browser to \
send files over e-mail via Evolution, Thunderbird, Sylpheed or Balsa."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.6"

RPM_NAME = "nautilus-sendto-3.8.6-8.6.aarch64.rpm"
RPM_HASH = "38de7c8022600f38d4e3e612b3ca57fe0c2fc3c9bbbb3c11087ea761c6847f50e1ef7be2d735fa59a54d23d10b4b28e32a982fbd0d3adb585bcb047bc6dbb001"

RPROVIDES:${PN} += "nautilus-sendto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
