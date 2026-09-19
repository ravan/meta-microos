SUMMARY = "Development files for ocaml-pyml"
DESCRIPTION = "The ocaml-pyml-devel package contains libraries and signature files for \
developing applications that use ocaml-pyml."
LICENSE = "BSD-2-Clause"

PV = "20250807"

RPM_NAME = "ocaml-pyml-devel-20250807-2.2.aarch64.rpm"
RPM_HASH = "50763de0b221c13ba9a8c9bc612aeaa8aa1dc824f91004c11274f3cbdccc16f653de55bebb0f54c795dcd87f4247cd08efa7c4c92294713d561c247e29900c49"

RPROVIDES:${PN} += "config-ocaml-pyml-devel \
ocaml-Numpy \
ocaml-Py \
ocaml-Pycaml \
ocaml-Pyml-arch \
ocaml-Pyops \
ocaml-Pytypes \
ocaml-Pyutils \
ocaml-Pywrappers \
ocaml-pyml-devel \
ocamlfind-pyml \
ocamlx-Numpy \
ocamlx-Py \
ocamlx-Pycaml \
ocamlx-Pyml-arch \
ocamlx-Pyops \
ocamlx-Pytypes \
ocamlx-Pyutils \
ocamlx-Pywrappers"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdcompat \
ocaml-Stdcompat--init \
ocaml-Stdcompat--stdlib-s \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Fun \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--In-channel \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Stdlib--Weak \
ocaml-Unix \
ocaml-pyml \
ocamlfind-bigarray \
ocamlfind-stdcompat \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-Stdcompat \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bigarray \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Fun \
ocamlx-Stdlib--Gc \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--In-channel \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lazy \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Stdlib--Weak \
ocamlx-Unix \
python3-base \
which"

inherit rpm
