SUMMARY = "SuperCollider support for Emacs"
DESCRIPTION = "SuperCollider support for the Emacs text editor."
LICENSE = "GPL-3.0-only"

PV = "3.14.1"

RPM_NAME = "supercollider-emacs-3.14.1-1.5.noarch.rpm"
RPM_HASH = "7b1734d637ccc3332ac6fc98f59c8c9188833fd20cc0d8569b0d179083c434123d359da76ab7bfd0c263f7f5713c8cbdedd4348be1a760981289fae2c5038d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supercollider-emacs"

RDEPENDS:${PN} += "supercollider"

inherit rpm
