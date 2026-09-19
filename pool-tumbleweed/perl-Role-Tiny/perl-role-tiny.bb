SUMMARY = "Roles: a nouvelle cuisine portion size slice of Moose"
DESCRIPTION = "'Role::Tiny' is a minimalist role composition tool."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.002005"

RPM_NAME = "perl-Role-Tiny-2.002005-1.3.noarch.rpm"
RPM_HASH = "ea23cb1de810131cc39dae1ced56d4a8c7bb9f1a0c383d06d127896e983487d801edbcc32a1c59c03b6da97bb4e65e0edb3d1c8e4bc4e9d39b3bec0405553fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Tiny \
perl-Role--Tiny--With \
perl-Role-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
