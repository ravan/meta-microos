SUMMARY = "Maps over integers implemented as Patricia trees"
DESCRIPTION = "OCaml implementation of an efficient maps over integers, \
from a paper by Chris Okasaki."
LICENSE = "LGPL-2.1-or-later-with-OCaml-linking-exception"

PV = "2.0.5"

RPM_NAME = "ocaml-ptmap-2.0.5-4.1.aarch64.rpm"
RPM_HASH = "9560ba48c70714fdc71c5b00e0c35a659f0a78f4a393f802412096fa0209d86c876182c678af01bf6241643aea942416e06e501f20215a8431742f603490b732"

RPROVIDES:${PN} += "ocaml-ptmap"

RDEPENDS:${PN} += ""

inherit rpm
