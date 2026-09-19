SUMMARY = "Development files for ocaml-calendar"
DESCRIPTION = "The ocaml-calendar-devel package contains libraries and signature files for \
developing applications that use ocaml-calendar."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "ocaml-calendar-devel-3.0.0-3.1.aarch64.rpm"
RPM_HASH = "0311cb34e7d069206acebbd20c215dca8bc259d33964c923ec56824522e31a7b03a0f049b3d67adef26bd53ba7e6b056251ae53ac6ef4e6e57c8d9b7392c209d"

RPROVIDES:${PN} += "ocaml-CalendarLib \
ocaml-CalendarLib--Calendar \
ocaml-CalendarLib--Calendar-builder \
ocaml-CalendarLib--Calendar-sig \
ocaml-CalendarLib--Date \
ocaml-CalendarLib--Date-sig \
ocaml-CalendarLib--Fcalendar \
ocaml-CalendarLib--Ftime \
ocaml-CalendarLib--Period \
ocaml-CalendarLib--Printer \
ocaml-CalendarLib--Time \
ocaml-CalendarLib--Time-Zone \
ocaml-CalendarLib--Time-sig \
ocaml-CalendarLib--Utils \
ocaml-CalendarLib--Version \
ocaml-calendar-devel \
ocamlfind-calendar \
ocamlx-CalendarLib \
ocamlx-CalendarLib--Calendar \
ocamlx-CalendarLib--Calendar-builder \
ocamlx-CalendarLib--Date \
ocamlx-CalendarLib--Fcalendar \
ocamlx-CalendarLib--Ftime \
ocamlx-CalendarLib--Printer \
ocamlx-CalendarLib--Time \
ocamlx-CalendarLib--Time-Zone \
ocamlx-CalendarLib--Utils \
ocamlx-CalendarLib--Version"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Re \
ocaml-Re-- \
ocaml-Re--Ast \
ocaml-Re--Automata \
ocaml-Re--Category \
ocaml-Re--Color-map \
ocaml-Re--Compile \
ocaml-Re--Core \
ocaml-Re--Cset \
ocaml-Re--Dyn \
ocaml-Re--Fmt \
ocaml-Re--Group \
ocaml-Re--Mark-infos \
ocaml-Re--Pmark \
ocaml-Re--Replace \
ocaml-Re--Str \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Mutex \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-calendar \
ocamlfind-re \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-Re--Str \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String \
ocamlx-Unix"

inherit rpm
