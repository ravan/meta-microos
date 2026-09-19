SUMMARY = "Development files for ocaml-cppo"
DESCRIPTION = "The ocaml-cppo-devel package contains libraries and signature files for \
developing applications that use ocaml-cppo."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "ocaml-cppo-devel-1.8.0-2.2.aarch64.rpm"
RPM_HASH = "8758c3b4ab684bbe0e70dcea669a98e9072c024cdf352466625f5d62afcad05b69d93c43715d7060babe61efb7d8bd17a8330298ba1c0069da525b719609dbe5"

RPROVIDES:${PN} += "ocaml-cppo-devel \
ocamlfind-cppo"

RDEPENDS:${PN} += "ocaml-cppo"

inherit rpm
