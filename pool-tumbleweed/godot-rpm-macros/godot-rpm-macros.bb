SUMMARY = "RPM macros for Godot"
DESCRIPTION = "Provides RPM macros that will allow for easier packaging of games made with \
the Godot engine."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "godot-rpm-macros-1-1.18.noarch.rpm"
RPM_HASH = "ec18af26f10c16a0107812514f96dcbb3ac5e272ae50da712f4394e594af4fed51044e5aff6d8ea6d65a7707e9ddde721712cc3aa9ca4570efdcf40a36fe7f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot-rpm-macros \
rpm-macro-godot-export \
rpm-macro-godot-prep"

RDEPENDS:${PN} += "coreutils"

inherit rpm
