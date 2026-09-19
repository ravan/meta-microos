SUMMARY = "Make a hash from @_ and set defaults in subs while checking that all man[cut]"
DESCRIPTION = "The module is a short utility I made after being sick and tired of writing \
redundant code to make a hash out of args when they are passed as key/value \
pairs including setting their defaults and checking for mandatory \
arguments."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.7.0"

RPM_NAME = "perl-Devel-TakeHashArgs-0.7.0-1.1.noarch.rpm"
RPM_HASH = "b842d995cd430d58a3f951b93204e3bcad812c48de9c8970c7d207e9698a802804956b5744b1951b87937c4f5c79140a9834d869e513a83aa5115b944335d8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--TakeHashArgs \
perl-Devel-TakeHashArgs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
