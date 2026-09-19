SUMMARY = "Retry $N Times"
DESCRIPTION = "Sub::Retry provides the function named 'retry'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Sub-Retry-0.06-1.32.noarch.rpm"
RPM_HASH = "6ebbaf0b7466daf8f442d19097c18b15792ccae347e8398463762074ad9ff03b44cdfa2a0307017539470f696500e78e6466664c8e4b0c275b0030ba51a77111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Retry \
perl-Sub-Retry"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
