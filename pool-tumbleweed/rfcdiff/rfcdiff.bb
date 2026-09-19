SUMMARY = "Draft Diff Tool"
DESCRIPTION = "The purpose of this program is to compare two versions of an \
Internet Draft, and as output produce a diff in one of several \
formats: \
- side-by-side HTML diff \
- paged wdiff output in a text terminal \
- a text file with changebars in the left margin \
- a simple unified diff output"
LICENSE = "GPL-2.0-or-later"

PV = "1.47"

RPM_NAME = "rfcdiff-1.47-1.18.noarch.rpm"
RPM_HASH = "08ec7e02277b404ecc8aa0e5b481b7f915fc9cb6b35d15350fef9745bf459d6d331f894e14ed859a67bc026256d83c3567f1a12da15166b2d71c226624fc4d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rfcdiff"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
