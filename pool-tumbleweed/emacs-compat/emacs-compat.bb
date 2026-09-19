SUMMARY = "COMPATibility Library for Emacs Lisp"
DESCRIPTION = "compat.el, the forwards-compatibility library for (GNU) Emacs Lisp, versions 24.4 and newer. The intended audience are package developers that are interested in using newer developments, without having to break compatibility."
LICENSE = "GPL-3.0-or-later"

PV = "31.0.0.2"

RPM_NAME = "emacs-compat-31.0.0.2-1.1.noarch.rpm"
RPM_HASH = "85c995ea7824e103d07fcc1a199d777dfff844622285dd655c3c0b837da5bbfa6098232a765c65d7ac88f5507c77bb0b6e0d865ef8429cc26c8f23c6b13e0f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-compat"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs"

inherit rpm
