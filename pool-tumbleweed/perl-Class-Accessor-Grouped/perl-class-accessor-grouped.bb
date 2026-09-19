SUMMARY = "Lets you build groups of accessors"
DESCRIPTION = "This class lets you build groups of accessors that will call different \
getters and setters. The documentation of this module still requires a lot \
of work (*volunteers welcome >.>*), but in the meantime you can refer to at \
http://lo-f.at/glahn/2009/08/WritingPowerfulAccessorsForPerlClasses.html \
for more information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10014"

RPM_NAME = "perl-Class-Accessor-Grouped-0.10014-1.31.noarch.rpm"
RPM_HASH = "bbbcb14827dc6bce4b869998aa28cad80e67fdc5c3a3f37cd6f7d45e0aa111d29d229cbd2e48787a8580d31b6c0329821ef9d89ff3f29b3112f2fdea40811ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Grouped \
perl-Class-Accessor-Grouped"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--XSAccessor \
perl-Module--Runtime \
perl-Sub--Name"

inherit rpm
