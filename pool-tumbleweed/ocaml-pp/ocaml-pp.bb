SUMMARY = "Pretty-printing library"
DESCRIPTION = "This library provides a lean alternative to the Format 1 module of the OCaml standard library. \
 \
Pp uses the same concepts of boxes and break hints, and the final rendering is done to formatter from the Format module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "ocaml-pp-2.0.0-2.1.aarch64.rpm"
RPM_HASH = "d88cb156c2459d235a8324a8a54ffea67bff840f95f0c7810aaa7befd334585fe4850a846412f5f8cc2516afe973ad4b2885a84fc52babb19fc656928bf16fa1"

RPROVIDES:${PN} += "ocaml-pp"

RDEPENDS:${PN} += ""

inherit rpm
