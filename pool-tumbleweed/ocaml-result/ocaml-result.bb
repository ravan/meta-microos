SUMMARY = "Compatibility OCaml Result module"
DESCRIPTION = "Projects that want to use the new result type defined in OCaml >= 4.03 while \
staying compatible with older version of OCaml should use the Result module \
defined in this library."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ocaml-result-1.5-4.1.aarch64.rpm"
RPM_HASH = "b3133eee95d2be77f430572bacc3b8e839a46cbcbadedb728040001641ad289431db16cf2d28934e0754852f6c4a34db83c6048da7d13d9838649ce300259e4a"

RPROVIDES:${PN} += "ocaml-result"

RDEPENDS:${PN} += ""

inherit rpm
