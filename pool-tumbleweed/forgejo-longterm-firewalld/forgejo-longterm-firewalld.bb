SUMMARY = "Firewalld profile for forgejo-longterm"
DESCRIPTION = "This package adds a firewalld service profile to forgejo-longterm"
LICENSE = "GPL-3.0-or-later"

PV = "15.0.6"

RPM_NAME = "forgejo-longterm-firewalld-15.0.6-1.1.noarch.rpm"
RPM_HASH = "04b4637e78221852015024524f810c58b198a2ef6929c353b6504226ee84526778898e811fe63ccf5b2e2a528f9e7334003d5399647c2a129ddbe5c018c4bf27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forgejo-longterm-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
