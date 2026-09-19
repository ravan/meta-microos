SUMMARY = "Time Object, with As Little Code As Possible"
DESCRIPTION = "*Time::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a time, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Time-Tiny-1.08-1.33.noarch.rpm"
RPM_HASH = "cce06e74cebbe3e0a6793f45a8abb826fb996990286dd95281275f88d4802745b9dde638a7ca7d9a4182fa996424325801b783c5a46744356a398ada4a720d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Tiny \
perl-Time-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
