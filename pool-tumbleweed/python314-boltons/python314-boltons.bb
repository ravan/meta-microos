SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "25.0.0"

RPM_NAME = "python314-boltons-25.0.0-2.4.noarch.rpm"
RPM_HASH = "4666fd944701b0d8c876007887623592b8edfa8237829ed3f1535edab3f168bf923c34cc30056acf048e350f0f2bc0014c3680f6ddc4567ad0a7f7a68f55ad15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-boltons \
python314-boltons \
python3dist-boltons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
