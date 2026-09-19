SUMMARY = "Utilities to write and check a MANIFEST file"
DESCRIPTION = "..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-ExtUtils-Manifest-1.75-1.17.noarch.rpm"
RPM_HASH = "6145b8538e83097fe5da242b57cb5534d019795bfdf2ceffc8d8401ab40c3dd9f92c33e16c1e8193fa0438b445a5647e3cf1b38f42d642c60908f20a005bc7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Manifest \
perl-ExtUtils-Manifest"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
