SUMMARY = "Bash completion for wl-clipboard"
DESCRIPTION = "Bash command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.3.0"

RPM_NAME = "wl-clipboard-bash-completion-2.3.0-1.3.noarch.rpm"
RPM_HASH = "ac6975ec9345da0e0518efd1e0cad9bcf0564db017269e0aab7fd36f7b4c7c417fe1d46ca216660a9b49f3b06a311b05f38cb15d0230f83bcaaaa067c522d0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-bash-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
