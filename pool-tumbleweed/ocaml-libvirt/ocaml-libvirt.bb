SUMMARY = "OCaml binding for libvirt"
DESCRIPTION = "OCaml binding for libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.6.1.7"

RPM_NAME = "ocaml-libvirt-0.6.1.7-3.1.aarch64.rpm"
RPM_HASH = "a70ba70bae9405faf782d61f58c658235b29b29bd708d5260b6728a456fbc50692436a0405bb0f4bb209290b20c1ab882576debb68f87e8077a40ca84c4ded10"

RPROVIDES:${PN} += "ocaml-libvirt"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libvirt.so.0"

inherit rpm
