SUMMARY = "Install hunspell"
DESCRIPTION = "This module provides the spelling library Hunspell. It will either detect \
it as provided by the operating system, or download the source from the \
Internet and install it for you. It uses Alien::Base."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-Alien-Hunspell-0.170.0-1.10.aarch64.rpm"
RPM_HASH = "1c97a9192d21be24a82c2233fc502ea754eb6dbf68037ea946bb228f8c6efafb9efda3c7ac4bf2cfe764ab041e48fedf203545f6d8cdaf365305a1c4ff1a80db"

RPROVIDES:${PN} += "perl-Alien--Hunspell \
perl-Alien-Hunspell \
perl-Test2--Require--Dev"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Alien--Base \
pkgconfig-hunspell"

inherit rpm
