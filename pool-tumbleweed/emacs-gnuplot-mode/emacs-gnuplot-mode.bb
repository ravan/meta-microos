SUMMARY = "Gnuplot mode for EMACS"
DESCRIPTION = "Gnuplot-mode is a major Emacs mode for editing Gnuplot source code. It \
provides syntax highlighting, automatic indentation and context sensitive \
command completion."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "emacs-gnuplot-mode-0.8.0-1.7.noarch.rpm"
RPM_HASH = "bda6384a6e5749fd4ad384deaf97a7926941fcc0e56d501236c8dd66146c322d61fe5f930c07b4d4bc6d9c78586f2ddf3e5c1fa63ed02f555c3c6f4420dda6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-gnuplot-mode \
gnuplot-/usr/share/emacs/site-lisp/gnuplot.el"

RDEPENDS:${PN} += "emacs \
gnuplot"

inherit rpm
