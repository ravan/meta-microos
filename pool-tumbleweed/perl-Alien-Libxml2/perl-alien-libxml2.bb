SUMMARY = "Install the C libxml2 library on your system"
DESCRIPTION = "This module provides 'libxml2' for other modules to use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.200.0"

RPM_NAME = "perl-Alien-Libxml2-0.200.0-1.11.aarch64.rpm"
RPM_HASH = "48e040ab54880a20955c98253cca3d2edce9473853dd27c4406b0a4a17116c5697011e72db04b7fa034f6526670979635c58dafd346f1c43625c60e05bef5e60"

RPROVIDES:${PN} += "perl-Alien--Libxml2 \
perl-Alien-Libxml2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Alien--Base"

inherit rpm
