SUMMARY = "Test routines for examining the contents of files"
DESCRIPTION = "Got an app that generates files? Then you need to test those files to make \
sure that their contents are correct. This module makes that easy. Use its \
test functions to make sure that the contents of files are exactly what you \
expect them to be."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.242"

RPM_NAME = "perl-Test-File-Contents-0.242-1.18.noarch.rpm"
RPM_HASH = "19615cccb0046acb076dc52a28b9553d3e09060b4dc786ecdb51487f80f1cf6e804c843fd6cffd49c2496413f2ac50d912b4f0dd23702fa9eb25372aa20f01a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--File--Contents \
perl-Test-File-Contents"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Builder \
perl-Text--Diff"

inherit rpm
