SUMMARY = "Fish Completion for erlang-rebar3"
DESCRIPTION = "The official fish completion script for rebar3."
LICENSE = "Apache-2.0"

PV = "3.23.0"

RPM_NAME = "erlang-rebar3-fish-completion-3.23.0-2.9.noarch.rpm"
RPM_HASH = "47d195cea0a2cca2af4ddbe456ffa605ae07295438b797e4687d37b1a6153a8f77fcb2c8464e3406ebb4d253e27c8b23d54db220807bc4d80368782b3b2fce38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "erlang-rebar3-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
