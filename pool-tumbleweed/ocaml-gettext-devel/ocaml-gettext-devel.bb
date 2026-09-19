SUMMARY = "Development files for ocaml-gettext"
DESCRIPTION = "The ocaml-gettext-devel package contains libraries and signature files for \
developing applications that use ocaml-gettext."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.5.0"

RPM_NAME = "ocaml-gettext-devel-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "74a6b395e2aba5cd231da14a2eccc24712acca05a57987e00e45982c384bd4699d0300e43916a9a4a61e105a0990293b560f2c3c909358d7f9d9d97ceb8986d7"

RPROVIDES:${PN} += "config-ocaml-gettext-devel \
ocaml-Gettext \
ocaml-GettextCategory \
ocaml-GettextCharset \
ocaml-GettextCompat \
ocaml-GettextCompile \
ocaml-GettextConfig \
ocaml-GettextConfigGen \
ocaml-GettextDomain \
ocaml-GettextDummy \
ocaml-GettextFormat \
ocaml-GettextFormat-lexer \
ocaml-GettextFormat-parser \
ocaml-GettextLocale \
ocaml-GettextLocale-lexer \
ocaml-GettextLocale-parser \
ocaml-GettextLocale-types \
ocaml-GettextMo \
ocaml-GettextMo-int32 \
ocaml-GettextMo-lexer \
ocaml-GettextMo-parser \
ocaml-GettextModules \
ocaml-GettextPo \
ocaml-GettextPo-lexer \
ocaml-GettextPo-parser \
ocaml-GettextPo-utils \
ocaml-GettextPoComment-lexer \
ocaml-GettextPoComment-parser \
ocaml-GettextRealize \
ocaml-GettextStub \
ocaml-GettextStubCompat \
ocaml-GettextTranslate \
ocaml-GettextTypes \
ocaml-GettextUtils \
ocaml-gettext-camomile-devel \
ocaml-gettext-devel \
ocamlfind-gettext \
ocamlfind-gettext-stub \
ocamlfind-gettext.base \
ocamlfind-gettext.extension \
ocamlx-Gettext \
ocamlx-GettextCategory \
ocamlx-GettextCharset \
ocamlx-GettextCompat \
ocamlx-GettextCompile \
ocamlx-GettextConfig \
ocamlx-GettextConfigGen \
ocamlx-GettextDomain \
ocamlx-GettextDummy \
ocamlx-GettextFormat \
ocamlx-GettextFormat-lexer \
ocamlx-GettextFormat-parser \
ocamlx-GettextLocale \
ocamlx-GettextLocale-lexer \
ocamlx-GettextLocale-parser \
ocamlx-GettextLocale-types \
ocamlx-GettextMo \
ocamlx-GettextMo-int32 \
ocamlx-GettextMo-lexer \
ocamlx-GettextMo-parser \
ocamlx-GettextModules \
ocamlx-GettextPo \
ocamlx-GettextPo-lexer \
ocamlx-GettextPo-parser \
ocamlx-GettextPo-utils \
ocamlx-GettextPoComment-lexer \
ocamlx-GettextPoComment-parser \
ocamlx-GettextRealize \
ocamlx-GettextStub \
ocamlx-GettextStubCompat \
ocamlx-GettextTranslate \
ocamlx-GettextTypes \
ocamlx-GettextUtils"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-FilePath \
ocaml-FileUtil \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-gettext \
ocamlfind-fileutils \
ocamlfind-gettext.base \
ocamlfind-gettext.extension \
ocamlx-FilePath \
ocamlx-FileUtil \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Marshal \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Unix"

inherit rpm
