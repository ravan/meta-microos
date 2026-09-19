SUMMARY = "OCaml runtime environment"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains the runtime environment needed to run OCaml \
bytecode."
LICENSE = "QPL-1.0"

PV = "5.5.0"

RPM_NAME = "ocaml-runtime-5.5.0-2.1.aarch64.rpm"
RPM_HASH = "dffcd8bcf78d73a2ca39cc45e0ee04bed94b009c8b08961c3272c11fd5a8d8e459a7cb09dae2f86a0df0f9469c3cf65101de532678883948fd72e63759fe9675"

RPROVIDES:${PN} += "ocaml-CamlinternalFormat \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-CamlinternalMod \
ocaml-CamlinternalOO \
ocaml-Dynlink \
ocaml-Dynlink-common \
ocaml-Dynlink-config \
ocaml-Dynlink-platform-intf \
ocaml-Dynlink-symtable \
ocaml-Dynlink-types \
ocaml-Event \
ocaml-Profiling \
ocaml-Runtime-events \
ocaml-Std-exit \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--ArrayLabels \
ocaml-Stdlib--Atomic \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Bool \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--BytesLabels \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Condition \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Dynarray \
ocaml-Stdlib--Effect \
ocaml-Stdlib--Either \
ocaml-Stdlib--Ephemeron \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Float \
ocaml-Stdlib--Format \
ocaml-Stdlib--Fun \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Iarray \
ocaml-Stdlib--In-channel \
ocaml-Stdlib--Int \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Map \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--MoreLabels \
ocaml-Stdlib--Mutex \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Oo \
ocaml-Stdlib--Option \
ocaml-Stdlib--Out-channel \
ocaml-Stdlib--Pair \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Pqueue \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Random \
ocaml-Stdlib--Repr \
ocaml-Stdlib--Result \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Semaphore \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Stack \
ocaml-Stdlib--StdLabels \
ocaml-Stdlib--String \
ocaml-Stdlib--StringLabels \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Type \
ocaml-Stdlib--Uchar \
ocaml-Stdlib--Unit \
ocaml-Stdlib--Weak \
ocaml-Str \
ocaml-Thread \
ocaml-Unix \
ocaml-UnixLabels \
ocaml-runtime"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libzstd.so.1"

inherit rpm
