SUMMARY = "Development package for ibus-table-extraphrase"
DESCRIPTION = "This package contains the files required for the development of \
ibus-table-extraphrase."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.9.20110826"

RPM_NAME = "ibus-table-extraphrase-devel-1.3.9.20110826-9.17.noarch.rpm"
RPM_HASH = "811fd4496696e27787270420b237ada96e467c18ec5fa578f51c9a18d683af94a4c30056a256d071c41bf2715dc799437180908bd5fad804b339c628adcb5860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-extraphrase-devel \
pkgconfig-ibus-table-extraphrase"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ibus-table-extraphrase \
pkgconfig-ibus-table"

inherit rpm
