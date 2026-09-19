SUMMARY = "Perl interface to functions that assist in working with salted hashes"
DESCRIPTION = "The 'Crypt::SaltedHash' module provides an object oriented interface to \
create salted (or seeded) hashes of clear text data. The original \
formalization of this concept comes from RFC-3112 and is extended by the \
use of different digital algorithms."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.120.0"

RPM_NAME = "perl-Crypt-SaltedHash-0.120.0-1.3.noarch.rpm"
RPM_HASH = "c17063afddf2ce95dddad6f56ced4f48540c3c0b3eeb7915bc923b55edae8589b8b114aa1cb2694de6c4ef585625ca79a57a270259f748681d39bea49bf47f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--SaltedHash \
perl-Crypt-SaltedHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--SysRandom"

inherit rpm
