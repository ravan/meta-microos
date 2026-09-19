SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs-devel contains development libraries \
required to use the OCaml bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "ocaml-libguestfs-devel-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "36075ddf40f5906755f2076259580d170d52b01bd3aeb6559de05a370952e8ff36a38552dd4b29f33664015d15dce0208acfb2cff9bf15faf44548f97bbfea99"

RPROVIDES:${PN} += "config-ocaml-libguestfs-devel \
ocaml-Guestfs \
ocaml-libguestfs-devel \
ocamlfind-guestfs \
ocamlx-Guestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs.so.0 \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalOO \
ocaml-Stdlib \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-libguestfs \
ocamlfind-unix \
ocamlx-CamlinternalOO \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Gc"

inherit rpm
