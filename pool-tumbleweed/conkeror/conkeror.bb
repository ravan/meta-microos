SUMMARY = "Keyboard-oriented customizable and extensible web browser"
DESCRIPTION = "Conkeror is a keyboard-oriented, highly-customizable, \
highly-extensible web browser based on Mozilla XULRunner, written \
mainly in JavaScript, and inspired by exceptional software such as \
Emacs and vi. Conkeror features a sophisticated keyboard system, \
allowing users to run commands and interact with content in powerful \
and novel ways. It is self-documenting, featuring a powerful \
interactive help system."
LICENSE = "MPL-1.1 | GPL-2.0 | LGPL-2.1"

PV = "1.0.4"

RPM_NAME = "conkeror-1.0.4-2.11.aarch64.rpm"
RPM_HASH = "23d5e817294bc2e5eb16333484e3991d73a9f6dde31fe19da10479db9ebeb66287052ae4a9e9dff684b2a43808cdbdaccf276e6f4b97edd325076e9829bc5115"

RPROVIDES:${PN} += "conkeror"

RDEPENDS:${PN} += "/usr/bin/sh \
firefox \
libc.so.6"

inherit rpm
