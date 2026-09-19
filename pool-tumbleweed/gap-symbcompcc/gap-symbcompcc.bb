SUMMARY = "GAP: Computing with parametrised presentations for p-groups of fixed coclass"
DESCRIPTION = "The SymbCompCC package computes with parametrised presentations for \
finite p-groups of fixed coclass."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "gap-symbcompcc-1.3.2-1.9.noarch.rpm"
RPM_HASH = "e9ae492625d913121bdc060de26061586582d4e7026d6ca1df9ef8dfddf9c2657399e27a83ee7baccdb475a82b9b4ecda794b47dab7e748252188500ad409771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-symbcompcc"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-polycyclic"

inherit rpm
