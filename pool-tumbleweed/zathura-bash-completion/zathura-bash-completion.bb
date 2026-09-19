SUMMARY = "Zathura Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for zathura"
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-bash-completion-2026.07.18-1.1.noarch.rpm"
RPM_HASH = "e05d93012a308998579b0491a7b5207a5859bf408908f4481d8f399dff88ae90267bf4626f4cbcb6395d005d1e2947c71527c26e2c9c1fa23bf1d9fdd57bda39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zathura-bash-completion"

RDEPENDS:${PN} += "bash-completion \
zathura"

inherit rpm
