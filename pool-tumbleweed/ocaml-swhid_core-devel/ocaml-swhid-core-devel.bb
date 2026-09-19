SUMMARY = "Development files for ocaml-swhid_core"
DESCRIPTION = "The ocaml-swhid_core-devel package contains libraries and signature files for \
developing applications that use ocaml-swhid_core."
LICENSE = "ISC"

PV = "0.1"

RPM_NAME = "ocaml-swhid_core-devel-0.1-4.1.aarch64.rpm"
RPM_HASH = "9d0905064699622b5090d3016685895ddcdae6c8010fcf8d1cf191139e27fb783aa33545a2ba6118f6a349f93d139b4fd2d554a3976de35126df63dd64d0b6c9"

RPROVIDES:${PN} += "ocaml-Swhid-core \
ocaml-Swhid-core--Compute \
ocaml-Swhid-core--Object \
ocaml-swhid-core-devel \
ocamlfind-swhid-core \
ocamlx-Swhid-core \
ocamlx-Swhid-core--Compute \
ocamlx-Swhid-core--Object"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-swhid-core \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String"

inherit rpm
