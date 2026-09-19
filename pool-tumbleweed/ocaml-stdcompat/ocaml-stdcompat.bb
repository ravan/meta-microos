SUMMARY = "Stdcompat: compatibility module for OCaml standard library"
DESCRIPTION = "Stdcompat is a compatibility layer allowing programs to use some recent additions to the OCaml standard library while preserving the ability to be compiled on former versions of OCaml."
LICENSE = "BSD-2-Clause"

PV = "21.1"

RPM_NAME = "ocaml-stdcompat-21.1-1.2.aarch64.rpm"
RPM_HASH = "9feec323c52b8cf8792ae57782788662d902283ab292abd87c2ef53106a6430191c3615255d7b5cc64fc7a3ae0a3a11b62be6078e26123395ef6b85a5723023b"

RPROVIDES:${PN} += "ocaml-stdcompat"

RDEPENDS:${PN} += ""

inherit rpm
