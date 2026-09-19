SUMMARY = "Bash completion for herbstluftwm"
DESCRIPTION = "Bash completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "herbstluftwm-bash-completion-0.9.6-1.3.noarch.rpm"
RPM_HASH = "28f26017be84c82cbd7eb9278e6dd72de6127af59e190fffbd4e979de049268e6bebd01d531aa992d1da75847500aa0ac38225ae366d7ddb73fa4f98443a95b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
herbstluftwm"

inherit rpm
