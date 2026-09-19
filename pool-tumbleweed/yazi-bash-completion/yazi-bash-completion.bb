SUMMARY = "Bash Completion for yazi"
DESCRIPTION = "The official bash completion script for yazi."
LICENSE = "MIT"

PV = "26.8.15"

RPM_NAME = "yazi-bash-completion-26.8.15-1.2.noarch.rpm"
RPM_HASH = "78b1dede99fa98220e81ffbf01ff503448d50256ed05197d04d143148e0a9ef52692794bd41b9af352d13286430764a63e211499b335b4dd3673d43cbcdac39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yazi-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
