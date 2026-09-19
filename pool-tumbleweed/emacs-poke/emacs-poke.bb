SUMMARY = "Emacs support for poke"
DESCRIPTION = "Provides Emacs support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "5.0"

RPM_NAME = "emacs-poke-5.0-1.1.noarch.rpm"
RPM_HASH = "bb7e1a90a03013f633b0f3a660c8108bc13227c39d6bcb24c9fcbf84b725afb446a33c3015ce31c2849e9e0a15a9aa6cc7240727579f9b270e307c875b34df26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-poke"

RDEPENDS:${PN} += "emacs \
poke"

inherit rpm
