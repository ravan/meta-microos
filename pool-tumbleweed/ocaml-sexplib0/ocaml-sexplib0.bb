SUMMARY = "Library containing the definition of S-expressions and some base converters"
DESCRIPTION = "Library containing the definition of S-expressions and some base converters."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "ocaml-sexplib0-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "dc57c9c52587ff795744a90b85fc7099fc07031905c8bd14db0472185429a323275c7a29d62081aaed00e43fd38288c8038d1591012c8b2be6500fce6a36ec64"

RPROVIDES:${PN} += "ocaml-sexplib0"

RDEPENDS:${PN} += ""

inherit rpm
