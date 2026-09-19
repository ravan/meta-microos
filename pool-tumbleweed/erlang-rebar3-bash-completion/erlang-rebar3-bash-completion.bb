SUMMARY = "Bash Completion for erlang-rebar3"
DESCRIPTION = "The official bash completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.23.0"

RPM_NAME = "erlang-rebar3-bash-completion-3.23.0-2.9.noarch.rpm"
RPM_HASH = "119ca64eafda76702be9875e83bc5053962a49d28de66a05da06580acba0b0e7d0a9e34ada0092cc593e00eb864b0ad5eecf09c3e791a7d6fd807948e10fe068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
