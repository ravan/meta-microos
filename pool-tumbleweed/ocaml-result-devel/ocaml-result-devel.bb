SUMMARY = "Development files for ocaml-result"
DESCRIPTION = "The ocaml-result-devel package contains libraries and signature files for \
developing applications that use ocaml-result."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ocaml-result-devel-1.5-4.1.aarch64.rpm"
RPM_HASH = "12a3cd8851c18583cd1fac65b852b194b09350a1f7010a7fe94fed6222a0d62ca60d53eb8ad550f5b18bee7c0725479c773028437be1c67e45a83185aa663aed"

RPROVIDES:${PN} += "ocaml-Result \
ocaml-result-devel \
ocamlfind-result \
ocamlx-Result"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Either \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-result \
ocamlx-Stdlib--Result"

inherit rpm
