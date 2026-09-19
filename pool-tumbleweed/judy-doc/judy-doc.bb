SUMMARY = "Development files for Judy"
DESCRIPTION = "This package contains documentation about Judy library and examples."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "judy-doc-1.0.5-11.9.noarch.rpm"
RPM_HASH = "b189ed883f34aaaecac520805e63087fb3cad049a787a157a8f544ad5a4d4749ce2c7a6ac1533699093e4f01114c500b644beba0c8bef14a13bac6d6d3780553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "judy-doc"

RDEPENDS:${PN} += ""

inherit rpm
