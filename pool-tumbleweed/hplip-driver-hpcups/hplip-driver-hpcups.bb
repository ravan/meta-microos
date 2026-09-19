SUMMARY = "Driver for HP printers and all-in-one devices (hpcups)"
DESCRIPTION = "This package provides printer setup support for most HP printers and all-in-one \
devices. It uses CUPS functionality to generate the PPDs for the printers \
dynamically. \
 \
This package is not necessary for operation of already configured devices."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-driver-hpcups-3.26.4-2.2.noarch.rpm"
RPM_HASH = "afa658f28975011efe44e87fae18571bfeabfdda72e099d405484ca4627f2961286504a472806d615f37139153ddc22ead4709ee84c4faed4254ff7e9bd4bb95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hplip-driver-hpcups \
hplip-hpijs"

RDEPENDS:${PN} += "hplip-cups"

inherit rpm
