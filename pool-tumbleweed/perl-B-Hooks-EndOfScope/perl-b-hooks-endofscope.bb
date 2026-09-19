SUMMARY = "Execute code after a scope finished compilation"
DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.280.0"

RPM_NAME = "perl-B-Hooks-EndOfScope-0.280.0-1.12.noarch.rpm"
RPM_HASH = "9eb995298264d58990697d8e795a0bcd66f6c1e8801f642701e6ce3d84b9c39fecc740ec25f8a9b935e1960bd2c276eb24e0e3dbdd2c29396c0b87ee27665dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Hooks--EndOfScope \
perl-B--Hooks--EndOfScope--PP \
perl-B--Hooks--EndOfScope--XS \
perl-B-Hooks-EndOfScope"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Hash--Util--FieldHash \
perl-Module--Implementation \
perl-Sub--Exporter--Progressive \
perl-Variable--Magic"

inherit rpm
