SUMMARY = "Documentation for the FOX Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The doc subpackage contains the HTML documentation to the FOX toolkit 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-doc-1.6.57-4.14.noarch.rpm"
RPM_HASH = "6b2d2588fc77acdd68b3317a5627a36c275ebb19262b715c49a8a184d98ab028dd88a98cc1b92b87feb68dcdac93e39a9603f6b6fb66b743759d8a951961d16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fox16-doc"

RDEPENDS:${PN} += ""

inherit rpm
