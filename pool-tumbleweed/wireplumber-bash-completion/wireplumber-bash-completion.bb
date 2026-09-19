SUMMARY = "Wireplumber Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for wpctl."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "wireplumber-bash-completion-0.5.17-1.1.aarch64.rpm"
RPM_HASH = "5f1d3093ec8ad76c417c1249b37bae8ed75f30b96066482d5b864424a3f1e5011303e7226537a5026202a139d3d446bf328d491130ea03ece732485527f1186f"

RPROVIDES:${PN} += "wireplumber-bash-completion"

RDEPENDS:${PN} += "bash-completion \
wireplumber"

inherit rpm
