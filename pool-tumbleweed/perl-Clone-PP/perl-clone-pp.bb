SUMMARY = "Recursively copy Perl datatypes"
DESCRIPTION = "This module provides a general-purpose clone function to make deep copies \
of Perl data structures. It calls itself recursively to copy nested hash, \
array, scalar and reference types, including tied variables and objects. \
 \
The clone() function takes a scalar argument to copy. To duplicate arrays \
or hashes, pass them in by reference: \
 \
  my $copy = clone(\\@array);    my @copy = @{ clone(\\@array) }; \
  my $copy = clone(\\%hash);     my %copy = %{ clone(\\%hash) }; \
 \
The clone() function also accepts an optional second parameter that can be \
used to limit the depth of the copy. If you pass a limit of 0, clone will \
return the same value you supplied; for a limit of 1, a shallow copy is \
constructed; for a limit of 2, two layers of copying are done, and so on. \
 \
  my $shallow_copy = clone( $item, 1 ); \
 \
To allow objects to intervene in the way they are copied, the clone() \
function checks for a couple of optional methods. If an object provides a \
method named 'clone_self', it is called and the result returned without \
further processing. Alternately, if an object provides a method named \
'clone_init', it is called on the copied object before it is returned."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Clone-PP-1.08-1.28.noarch.rpm"
RPM_HASH = "8f5880e9a9610f323b1b0078f910e98955e6fb492eae09d382192d832cdcb88b6709c328a8982c82125e012508d5f3a9e26c7448cf8cdb77524fea401a7f9e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Clone--PP \
perl-Clone-PP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
