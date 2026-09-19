SUMMARY = "Fish Completion for rye"
DESCRIPTION = "Fish command-line completion support for rye."
LICENSE = "MIT"

PV = "0.44.0"

RPM_NAME = "rye-fish-completion-0.44.0-1.8.noarch.rpm"
RPM_HASH = "8bf6e0b1ef07161aa6985c92872f47c127e27274cc0658d234a6fc624a4187962be02436ca57a7808136dbec5fe875270816c0f34f64ea0f7af75d0ed039d235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rye-fish-completion"

RDEPENDS:${PN} += "fish \
rye"

inherit rpm
