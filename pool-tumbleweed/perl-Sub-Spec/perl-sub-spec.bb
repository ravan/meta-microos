SUMMARY = "Subroutine metadata specification"
DESCRIPTION = "Subroutine metadata specification"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0.7"

RPM_NAME = "perl-Sub-Spec-1.0.7-9.41.noarch.rpm"
RPM_HASH = "df52047a9bb670ebe5841e5f5a327aa6a1f6b5358aac5968cad3eca1912044db8df69aa2c397ba35997a3ef3b94dcdd42d32aa946be8acec40bb390d4c601338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Spec \
perl-Sub--Spec--Schema \
perl-Sub--Spec--Util \
perl-Sub-Spec"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-Log--Any \
perl-Probe--Perl \
perl-Test--More"

inherit rpm
