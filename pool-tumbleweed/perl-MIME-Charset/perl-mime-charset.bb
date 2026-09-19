SUMMARY = "Charset Information for MIME"
DESCRIPTION = "MIME::Charset provides information about character sets used for MIME \
messages on Internet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.013.1"

RPM_NAME = "perl-MIME-Charset-1.013.1-1.18.noarch.rpm"
RPM_HASH = "f1e633d9ff1c2af3c0c47b038707a85ef9d4e15f420d7c20065e7a6495db2d23fa899e3925cac3341425e21a219cb1836f3ada52534ee856bdbe355480ee0330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Charset \
perl-MIME--Charset---Compat \
perl-MIME--Charset--UTF \
perl-MIME-Charset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
