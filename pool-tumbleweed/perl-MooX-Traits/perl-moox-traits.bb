SUMMARY = "Automatically apply roles at object creation time"
DESCRIPTION = "Was any of the SYNOPSIS unexpected? Basically, this module is the same \
thing as MooseX::Traits and MouseX::Traits, only for Moo. _Quelle \
surprise_, right?"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-MooX-Traits-0.005-1.28.noarch.rpm"
RPM_HASH = "14b6d0eb077dc28ff5c61ceaae811f1914b4a91c139c38ef6ab675be9be6ea575cf3dd68c486a7570b3fdbaab8cd07e6d4fba60aac85c22fca734f0987b3733e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Traits \
perl-MooX--Traits--Util \
perl-MooX-Traits"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter--Shiny \
perl-Module--Runtime \
perl-Role--Tiny"

inherit rpm
