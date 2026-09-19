SUMMARY = "Facility for creating read-only scalars, arrays, and hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, and hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.014"

RPM_NAME = "perl-Const-Fast-0.014-1.41.noarch.rpm"
RPM_HASH = "efe6758851066de3d07a34e8431f72cfd4fbeaa8dccab1b0406a5ae84a46dd8cd5d1f9d528a7de6c7b7d20c80edc9f4682e7dbdb6bbd4dce7a740adf4a4c77a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Const--Fast \
perl-Const-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Sub--Exporter--Progressive"

inherit rpm
