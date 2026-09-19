SUMMARY = "The shell-integation file(s) for the Kitty terminal"
DESCRIPTION = "shell-integration [bash,fish,zsh] file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.48.2"

RPM_NAME = "kitty-shell-integration-0.48.2-1.1.aarch64.rpm"
RPM_HASH = "08fb67ab2583d96d91859343c37cace899f7a6145cdb5f2449f0939c70793a7eb80190a85d40d13f539fb421c069259d1ce6df9d0436f91a13b6601ad47cc92c"

RPROVIDES:${PN} += "kitty-shell-integration"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
