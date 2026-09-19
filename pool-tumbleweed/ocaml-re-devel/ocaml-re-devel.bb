SUMMARY = "Development files for ocaml-re"
DESCRIPTION = "The ocaml-re-devel package contains libraries and signature files for \
developing applications that use ocaml-re."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.14.0"

RPM_NAME = "ocaml-re-devel-1.14.0-2.1.aarch64.rpm"
RPM_HASH = "2f4366d323b99fc380e02294d09e7953756a01e69ced75695c3fd9f1acf8e2203e52bce515b0bddf77b252e01156ed74eccb15fd25ce301962dc906e4e673053"

RPROVIDES:${PN} += "ocaml-Re \
ocaml-Re-- \
ocaml-Re--Ast \
ocaml-Re--Automata \
ocaml-Re--Bit-vector \
ocaml-Re--Category \
ocaml-Re--Color-map \
ocaml-Re--Compile \
ocaml-Re--Core \
ocaml-Re--Cset \
ocaml-Re--Dense-map \
ocaml-Re--Dyn \
ocaml-Re--Emacs \
ocaml-Re--Fmt \
ocaml-Re--Glob \
ocaml-Re--Group \
ocaml-Re--Hash-set \
ocaml-Re--Import \
ocaml-Re--Mark-infos \
ocaml-Re--Parse-buffer \
ocaml-Re--Pcre \
ocaml-Re--Perl \
ocaml-Re--Pmark \
ocaml-Re--Posix \
ocaml-Re--Posix-class \
ocaml-Re--Replace \
ocaml-Re--Search \
ocaml-Re--Slice \
ocaml-Re--Str \
ocaml-Re--View \
ocaml-Re-emacs \
ocaml-Re-glob \
ocaml-Re-pcre \
ocaml-Re-perl \
ocaml-Re-posix \
ocaml-Re-str \
ocaml-re-devel \
ocamlfind-re \
ocamlfind-re.emacs \
ocamlfind-re.glob \
ocamlfind-re.pcre \
ocamlfind-re.perl \
ocamlfind-re.posix \
ocamlfind-re.str \
ocamlx-Re \
ocamlx-Re-- \
ocamlx-Re--Ast \
ocamlx-Re--Automata \
ocamlx-Re--Bit-vector \
ocamlx-Re--Category \
ocamlx-Re--Color-map \
ocamlx-Re--Compile \
ocamlx-Re--Core \
ocamlx-Re--Cset \
ocamlx-Re--Dense-map \
ocamlx-Re--Dyn \
ocamlx-Re--Emacs \
ocamlx-Re--Fmt \
ocamlx-Re--Glob \
ocamlx-Re--Group \
ocamlx-Re--Hash-set \
ocamlx-Re--Import \
ocamlx-Re--Mark-infos \
ocamlx-Re--Parse-buffer \
ocamlx-Re--Pcre \
ocamlx-Re--Perl \
ocamlx-Re--Pmark \
ocamlx-Re--Posix \
ocamlx-Re--Posix-class \
ocamlx-Re--Replace \
ocamlx-Re--Search \
ocamlx-Re--Slice \
ocamlx-Re--Str \
ocamlx-Re--View \
ocamlx-Re-emacs \
ocamlx-Re-glob \
ocamlx-Re-pcre \
ocamlx-Re-perl \
ocamlx-Re-posix \
ocamlx-Re-str"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Atomic \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Map \
ocaml-Stdlib--Mutex \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-re \
ocamlfind-re \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Atomic \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Domain \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--List \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Mutex \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Seq \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String"

inherit rpm
