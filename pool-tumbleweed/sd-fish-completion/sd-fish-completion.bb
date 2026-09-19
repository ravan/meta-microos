SUMMARY = "Fish Completion for sd"
DESCRIPTION = "Fish command-line completion support for sd."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & BSD-3-Clause & MIT & (MIT | Unlicense)"

PV = "1.1.0"

RPM_NAME = "sd-fish-completion-1.1.0-1.4.noarch.rpm"
RPM_HASH = "344dbe417908b818be2b1ad7a410cd5929c0ab1d249ed4bb3313e8c02005540176bbb5c870303ca438c20a4eff1f660738a05c7c2d7ede2ef1a3cfb682aff2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sd-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
