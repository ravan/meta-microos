SUMMARY = "(Re)name a sub"
DESCRIPTION = "This module has only one function, which is also exported by default:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.280.0"

RPM_NAME = "perl-Sub-Name-0.280.0-1.11.aarch64.rpm"
RPM_HASH = "422d011306b7c209fb366b921990ce05e27d034891a4542a495de8c656dc54dab42159dd9090e18305624ae3393168d40183a7c1a06e1092160e634511c18b4b"

RPROVIDES:${PN} += "perl-Sub--Name \
perl-Sub-Name"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
