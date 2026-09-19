SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot3, godot3-headless, \
godot3-runner and godot3-server. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.6.3"

RPM_NAME = "godot3-bash-completion-3.6.3-1.1.noarch.rpm"
RPM_HASH = "31a9365dbd27b1279209839ffc7f8478276d111283a1041d49b9b131274b2aff9a9979e8a441f827362b4879febca05b10bdbf8d735514495817f7fc9d60efcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot3-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
