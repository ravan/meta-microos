SUMMARY = "Various portability utilities for module builders"
DESCRIPTION = "This module provides various portable helper functions for module building \
modules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.28.0"

RPM_NAME = "perl-ExtUtils-Helpers-0.28.0-1.10.noarch.rpm"
RPM_HASH = "b8d25bccc29d3e26b15004f37c9ef01d3592a3f0da3a5ce96ac49fde064695d6884a246f742bf89452de32941734db37ebdc9678fea61bd71057a4c0f93a2a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Helpers \
perl-ExtUtils--Helpers--Unix \
perl-ExtUtils--Helpers--VMS \
perl-ExtUtils--Helpers--Windows \
perl-ExtUtils-Helpers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
