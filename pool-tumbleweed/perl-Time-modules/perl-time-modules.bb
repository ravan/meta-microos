SUMMARY = "Various Perl time modules"
DESCRIPTION = "Perl modules providing various time functions."
LICENSE = "SUSE-Permissive"

PV = "2013.0912"

RPM_NAME = "perl-Time-modules-2013.0912-2.10.aarch64.rpm"
RPM_HASH = "a32fbca3ba1e7b0bd0c1963ac50db25d48216b03a2c3621dba53fe58917d5e9f88324c236e16977d763daedea5c8323c658431353870d2bfa0f4d049fd523503"

RPROVIDES:${PN} += "perl-Time--CTime \
perl-Time--DaysInMonth \
perl-Time--JulianDay \
perl-Time--ParseDate \
perl-Time--Timezone \
perl-Time-modules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
