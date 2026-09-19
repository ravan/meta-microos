SUMMARY = "library to work with swhids"
DESCRIPTION = "swhid_core is an OCaml library to with with Software Heritage \
persistent identifiers (swhids)."
LICENSE = "ISC"

PV = "0.1"

RPM_NAME = "ocaml-swhid_core-0.1-4.1.aarch64.rpm"
RPM_HASH = "5e43efea34e2bf09471b9b758ecb64f1ccf2d91e34359ce13fc4b583fb0b3091ab9c51392b1acb877ec60de25256fae060fc054bbc3b02a2c14996dc9bc7169c"

RPROVIDES:${PN} += "ocaml-swhid-core"

RDEPENDS:${PN} += ""

inherit rpm
