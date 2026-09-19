SUMMARY = "The fish shell support for pantheon-terminal"
DESCRIPTION = "Lightweight and modern Terminal for the Pantheon Desktop. \
 \
This package contains the configuration files when using the fish shell."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-terminal-fish-completion-8.1.0-1.1.noarch.rpm"
RPM_HASH = "23c8b5fdc36bb057381265faab400f40544f1b79c73e6fc40fa6408af2b5e063ccc71926d9fff393ce75824670390d9c4105334f0b1a4c5529412096c68ea4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pantheon-terminal-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
