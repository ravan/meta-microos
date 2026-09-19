SUMMARY = "Fish completion for flameshot"
DESCRIPTION = "Fish command line completion support for flameshot."
LICENSE = "GPL-3.0-only"

PV = "14.0.0"

RPM_NAME = "flameshot-fish-completion-14.0.0-1.2.noarch.rpm"
RPM_HASH = "9a2f0ac4da8b4a817820beb20f20b1fa2c54d5d31830b47fc99b09adca6d1375b22cd646b7cc126dfd27371f07345ddeb14a359a8b36d68e85aea91bfc2c3ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-fish-completion"

RDEPENDS:${PN} += "flameshot"

inherit rpm
