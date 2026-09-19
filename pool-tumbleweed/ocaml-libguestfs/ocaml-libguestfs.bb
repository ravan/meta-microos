SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs contains OCaml bindings for libguestfs. \
 \
This is for toplevel and scripting access only.  To compile OCaml \
programs which use libguestfs you will also need ocaml-libguestfs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "ocaml-libguestfs-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "cc8789d9f3f7d073c427ff333af6d4cfc33749877187bdb7334e7fbe7afe99019431b75575c19836d692bf722b6d25d6d922dae4fc480d33227e06df47163a84"

RPROVIDES:${PN} += "ocaml-libguestfs"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
