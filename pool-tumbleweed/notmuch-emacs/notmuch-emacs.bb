SUMMARY = "Emacs lisp email client based on notmuch"
DESCRIPTION = "notmuch-based email client written in emacs lisp"
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "notmuch-emacs-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "e35d1f906b1e6f22f74191173beedc25fe256f15906ee67db7952b654c35dd015f697b3306653edfe520bbe88b96dfd035cb90d6c8c099b56ca14f2e19a0e597"

RPROVIDES:${PN} += "notmuch-emacs"

RDEPENDS:${PN} += "emacs \
emacs-el \
notmuch"

inherit rpm
