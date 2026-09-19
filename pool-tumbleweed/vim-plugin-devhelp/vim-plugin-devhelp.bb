SUMMARY = "Devhelp plugin for Vim"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for Vim."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "vim-plugin-devhelp-43.0-3.7.aarch64.rpm"
RPM_HASH = "fd105086afc07cbdbe200872598239520002718612db63450817bf939ec6347f4db5151d96df4542ae931e94a056f5b05f814131956837229481784677a7f751"

RPROVIDES:${PN} += "vim-plugin-devhelp"

RDEPENDS:${PN} += "devhelp \
vim"

inherit rpm
