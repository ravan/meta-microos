SUMMARY = "Library to provide MIME feature for GNU Emacs"
DESCRIPTION = "SEMI is a library to provide MIME feature for GNU Emacs.  MIME is a \
proposed internet standard for including content and headers other than \
(ASCII) plain text in messages"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.6+239+gb1c245b81715"

RPM_NAME = "emacs-semi-1.14.6+239+gb1c245b81715-1.12.noarch.rpm"
RPM_HASH = "614ba65b58d2f48426f64e37d62c2f58e8ada1bb25de2ff21e64c354fc401de9e48730337fc566c1cc065500a06f1705a78679b83a7c957afa2797abbd9d9523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-semi \
semi-emacs"

RDEPENDS:${PN} += "emacs \
emacs-flim \
emacs-program"

inherit rpm
