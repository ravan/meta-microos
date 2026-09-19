SUMMARY = "Collect information about a user"
DESCRIPTION = "The 'User-Identity' distribution is created to maintain a set of \
informational objects which are related to one user. The 'User::Identity' \
module tries to be smart providing defaults, conversions and often required \
combinations. \
 \
*Be aware:* This module versions 4.0 and up is not fully compatible with \
older releases: mainly the exception handling has changed. When you need to \
upgrade, please read at https://github.com/markov2/perl5-Mail-Box/wiki/. \
*Version 3 is still maintained* and may see new releases as well. \
 \
The identities are not implementing any kind of storage, and can therefore \
be created by any simple or complex Perl program. This way, it is more \
flexible than an XML file to store the data. For instance, you can decide \
to store the data with Data::Dumper, Storable, DBI, AddressBook or \
whatever. Extension to simplify this task are still to be developed. \
 \
If you need more kinds of user information, then please contact the module \
author. \
 \
Extends 'DESCRIPTION' in User::Identity::Item."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.0.0"

RPM_NAME = "perl-User-Identity-4.0.0-1.5.noarch.rpm"
RPM_HASH = "a2db53407cddb58b8ccbe0a8b43ab6abdf9a661fac08662f049d97ca6e76e8ccff3bde3a7b887aa7c0439cf0390cd5def47b7d5b2882a8bc925ca9063db061f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Identity \
perl-User--Identity \
perl-User--Identity--Archive \
perl-User--Identity--Archive--Plain \
perl-User--Identity--Collection \
perl-User--Identity--Collection--Emails \
perl-User--Identity--Collection--Locations \
perl-User--Identity--Collection--Systems \
perl-User--Identity--Collection--Users \
perl-User--Identity--Item \
perl-User--Identity--Location \
perl-User--Identity--System \
perl-User-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Hash--Ordered \
perl-Log--Report"

inherit rpm
