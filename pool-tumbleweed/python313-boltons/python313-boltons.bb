SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "25.0.0"

RPM_NAME = "python313-boltons-25.0.0-2.4.noarch.rpm"
RPM_HASH = "f773b58c8172e5e03e8287ecde6b1a273958a7df98c039998e81c8d4346ea64f8397ce7a947b9152c1e6206a9f27c8948c7c27051871b1609e47ff3551625c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boltons \
python3.13dist-boltons \
python313-boltons \
python3dist-boltons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
