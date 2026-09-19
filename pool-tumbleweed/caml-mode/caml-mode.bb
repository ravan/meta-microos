SUMMARY = "Emacs mode for OCaml"
DESCRIPTION = "This package provides Emacs mode for OCaml."
LICENSE = "GPL-2.0-or-later"

PV = "4.08.0+git20190413.38ebde1"

RPM_NAME = "caml-mode-4.08.0+git20190413.38ebde1-1.17.noarch.rpm"
RPM_HASH = "726b3cb48218ef7fdc8db609edabe8d14628244c669b12d4a96e2e284d6d0470944b8ca37e013e321d71c09f16b4bdd3419e7e4b082e2aeb3272b569aacd0b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caml-mode \
ocaml-emacs"

RDEPENDS:${PN} += "emacs \
ocaml"

inherit rpm
