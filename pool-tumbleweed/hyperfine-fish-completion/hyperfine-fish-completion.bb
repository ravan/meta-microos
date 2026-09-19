SUMMARY = "Fish Completion for hyperfine"
DESCRIPTION = "The official fish completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.20.0"

RPM_NAME = "hyperfine-fish-completion-1.20.0-2.4.noarch.rpm"
RPM_HASH = "d91cf044b87fa86ffa0e921480d254201e7b8e9ed9f4c24ce497933d1388c2a8e14613c0bd1f2f4c425c188c6f003d20ed1638fbfae821ef07c4fa6915550230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-fish-completion"

RDEPENDS:${PN} += "hyperfine"

inherit rpm
