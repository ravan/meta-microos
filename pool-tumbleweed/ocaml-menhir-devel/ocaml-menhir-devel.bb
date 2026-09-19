SUMMARY = "Development files for ocaml-menhir"
DESCRIPTION = "The ocaml-menhir-devel package contains libraries and signature files for \
developing applications that use ocaml-menhir."
LICENSE = "LGPL-2.0"

PV = "20260209"

RPM_NAME = "ocaml-menhir-devel-20260209-1.2.aarch64.rpm"
RPM_HASH = "daee991a69763400c360f06aa9965c477b7bfd76628ee19695b2f08ebe4f623a7fed39a94cce72e3294ccdadeef473fb3fcd51818770fd88d9ee9885bcf32170"

RPROVIDES:${PN} += "ocaml-MenhirGLR \
ocaml-MenhirGLR--GLR \
ocaml-MenhirGLR--GLRAPI \
ocaml-MenhirGLR--GSS \
ocaml-MenhirGLR--Input \
ocaml-MenhirGLR--LinearizedArray \
ocaml-MenhirGLR--MiniBabySet \
ocaml-MenhirGLR--MiniVector \
ocaml-MenhirGLR--PackedIntArray \
ocaml-MenhirGLR--Path \
ocaml-MenhirGLR--PriorityQueue \
ocaml-MenhirGLR--RowDisplacementDecode \
ocaml-MenhirGLR--StaticVersion \
ocaml-MenhirGLR--TableFormat \
ocaml-MenhirGLR--TableInterpreter \
ocaml-MenhirGLR--Tops \
ocaml-MenhirLib \
ocaml-MenhirLib--Convert \
ocaml-MenhirLib--Engine \
ocaml-MenhirLib--EngineTypes \
ocaml-MenhirLib--ErrorReports \
ocaml-MenhirLib--IncrementalEngine \
ocaml-MenhirLib--InspectionTableFormat \
ocaml-MenhirLib--InspectionTableInterpreter \
ocaml-MenhirLib--LexerUtil \
ocaml-MenhirLib--LinearizedArray \
ocaml-MenhirLib--PackedIntArray \
ocaml-MenhirLib--Printers \
ocaml-MenhirLib--RowDisplacementDecode \
ocaml-MenhirLib--StaticVersion \
ocaml-MenhirLib--TableFormat \
ocaml-MenhirLib--TableInterpreter \
ocaml-MenhirSdk \
ocaml-MenhirSdk--Cmly-api \
ocaml-MenhirSdk--Cmly-format \
ocaml-MenhirSdk--Cmly-read \
ocaml-MenhirSdk--Keyword \
ocaml-MenhirSdk--Version \
ocaml-menhir-devel \
ocamlfind-menhir \
ocamlfind-menhirGLR \
ocamlfind-menhirLib \
ocamlfind-menhirSdk \
ocamlx-MenhirGLR \
ocamlx-MenhirGLR--GLR \
ocamlx-MenhirGLR--GLRAPI \
ocamlx-MenhirGLR--GSS \
ocamlx-MenhirGLR--Input \
ocamlx-MenhirGLR--LinearizedArray \
ocamlx-MenhirGLR--MiniBabySet \
ocamlx-MenhirGLR--MiniVector \
ocamlx-MenhirGLR--PackedIntArray \
ocamlx-MenhirGLR--Path \
ocamlx-MenhirGLR--PriorityQueue \
ocamlx-MenhirGLR--RowDisplacementDecode \
ocamlx-MenhirGLR--StaticVersion \
ocamlx-MenhirGLR--TableFormat \
ocamlx-MenhirGLR--TableInterpreter \
ocamlx-MenhirGLR--Tops \
ocamlx-MenhirLib \
ocamlx-MenhirLib--Convert \
ocamlx-MenhirLib--Engine \
ocamlx-MenhirLib--EngineTypes \
ocamlx-MenhirLib--ErrorReports \
ocamlx-MenhirLib--IncrementalEngine \
ocamlx-MenhirLib--InspectionTableFormat \
ocamlx-MenhirLib--InspectionTableInterpreter \
ocamlx-MenhirLib--LexerUtil \
ocamlx-MenhirLib--LinearizedArray \
ocamlx-MenhirLib--PackedIntArray \
ocamlx-MenhirLib--Printers \
ocamlx-MenhirLib--RowDisplacementDecode \
ocamlx-MenhirLib--StaticVersion \
ocamlx-MenhirLib--TableFormat \
ocamlx-MenhirLib--TableInterpreter \
ocamlx-MenhirSdk \
ocamlx-MenhirSdk--Cmly-api \
ocamlx-MenhirSdk--Cmly-format \
ocamlx-MenhirSdk--Cmly-read \
ocamlx-MenhirSdk--Keyword \
ocamlx-MenhirSdk--Version"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-menhir \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Marshal \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
