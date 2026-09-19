SUMMARY = "GNU Aspell - Spell compatibility"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains a spell script for compatibility reasons so that programs \
that expect the 'spell' command will work correctly."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8.2"

RPM_NAME = "aspell-spell-0.60.8.2-1.3.aarch64.rpm"
RPM_HASH = "74d914f03aa1999787bcde9b30399e969cf5a6ee879f4305245e8ed586046721f79ef78aec028ec0fe61c9581bd47c2036448659f3a7012bcd610fc41002d1b6"

RPROVIDES:${PN} += "aspell-spell \
spell"

RDEPENDS:${PN} += "aspell"

inherit rpm
