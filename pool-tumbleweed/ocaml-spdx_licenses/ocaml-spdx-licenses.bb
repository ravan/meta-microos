SUMMARY = "A library providing a strict SPDX License Expression parser"
DESCRIPTION = "An OCaml library aiming to provide an up-to-date and strict SPDX \
License Expression parser."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "ocaml-spdx_licenses-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "2bb1ee8ab901dab3c09c646b04de89749e33eb6c1d16aa0e292ab26c91c19d813234a1458ce10b7823a3f95ffc26500b0f59510ea2c0264daa6ac73bc56a6d3b"

RPROVIDES:${PN} += "ocaml-spdx-licenses"

RDEPENDS:${PN} += ""

inherit rpm
