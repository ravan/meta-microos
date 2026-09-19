SUMMARY = "The terminfo file for the Kitty terminal"
DESCRIPTION = "Provides 'xterm-kitty' terminfo file(s) for the Kitty terminal; this package can be installed on its own to provide file(s) instead of the full kitty package on remote systems."
LICENSE = "GPL-3.0-only"

PV = "0.48.2"

RPM_NAME = "kitty-terminfo-0.48.2-1.1.noarch.rpm"
RPM_HASH = "f5b1fee536b4a59d99a5965d4ef7f54ceaad1f5577f9d4a6f4eb74c0937933730146fb1329a10d4c711d8c14f532a7989dbf6b8f28f8b52311a9fb385628ef1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kitty-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
