SUMMARY = "Perl Blowfish encryption module"
DESCRIPTION = "Blowfish is capable of strong encryption and can use key sizes up to 56 \
bytes (a 448 bit key). You're encouraged to take advantage of the full key \
size to ensure the strongest encryption possible from this module."
LICENSE = "BSD-3-Clause"

PV = "2.14"

RPM_NAME = "perl-Crypt-Blowfish-2.14-5.55.aarch64.rpm"
RPM_HASH = "8518ee1bc787a7eddd6601e49d46e509820bdd3d896edb92e398fde1b6d7f6479b0be18020f4358cfdcf1c5378f67482f2211528faaaa47f0fe389833ddcea22"

RPROVIDES:${PN} += "perl-Crypt--Blowfish \
perl-Crypt-Blowfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
