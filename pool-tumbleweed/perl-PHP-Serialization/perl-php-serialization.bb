SUMMARY = "De-/serialize() PHP output into Perl"
DESCRIPTION = "Provides a simple, quick means of serializing perl memory structures \
(including object data!) into a format that PHP can deserialize() and \
access, and vice versa. \
 \
NOTE: Converts PHP arrays into Perl Arrays when the PHP array used \
exclusively numeric indexes, and into Perl Hashes then the PHP array did \
not."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.34"

RPM_NAME = "perl-PHP-Serialization-0.34-13.42.noarch.rpm"
RPM_HASH = "385425aadcaa43b1e4e6b07f4d03764ec01398648aab2e4f6b99a44e509954e9509a4a9159a380928d8389638b0aa9568d8733f62264d65ed1783b0d8196f093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PHP--Serialization \
perl-PHP--Serialization--Object \
perl-PHP-Serialization"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
