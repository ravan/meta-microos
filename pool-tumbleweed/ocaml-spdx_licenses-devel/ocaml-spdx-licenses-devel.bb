SUMMARY = "Development files for ocaml-spdx_licenses"
DESCRIPTION = "The ocaml-spdx_licenses-devel package contains libraries and signature files for \
developing applications that use ocaml-spdx_licenses."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "ocaml-spdx_licenses-devel-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "714d33da490872bdec39314948e0f333e3caed8ff8a8684441d3024a3f88e00752f291bd81dd500315a709eb301ec1bc2080d82edeca1950e1490095a7291e7d"

RPROVIDES:${PN} += "ocaml-Spdx-licenses \
ocaml-Spdx-licenses-- \
ocaml-Spdx-licenses--ExceptionIDs \
ocaml-Spdx-licenses--Lexer \
ocaml-Spdx-licenses--LicenseIDs \
ocaml-Spdx-licenses--Parser \
ocaml-Spdx-licenses--Types \
ocaml-spdx-licenses-devel \
ocamlfind-spdx-licenses \
ocamlx-Spdx-licenses \
ocamlx-Spdx-licenses-- \
ocamlx-Spdx-licenses--ExceptionIDs \
ocamlx-Spdx-licenses--Lexer \
ocamlx-Spdx-licenses--LicenseIDs \
ocamlx-Spdx-licenses--Parser"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Either \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-spdx-licenses \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Result \
ocamlx-Stdlib--String"

inherit rpm
