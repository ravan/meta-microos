SUMMARY = "Unordered collections (sets) of Perl Objects"
DESCRIPTION = "This modules implements a set of objects, that is, an unordered collection \
of objects without duplication. \
 \
The term _objects_ is applied loosely - for the sake of Set::Object, \
anything that is a reference is considered an object. \
 \
Set::Object 1.09 and later includes support for inserting scalars \
(including the empty string, but excluding 'undef') as well as objects. \
This can be thought of as (and is currently implemented as) a degenerate \
hash that only has keys and no values. Unlike objects placed into a \
Set::Object, scalars that are inserted will be flattened into strings, so \
will lose any magic (eg, tie) or other special bits that they went in with; \
only strings come out."
LICENSE = "Artistic-2.0"

PV = "1.420.0"

RPM_NAME = "perl-Set-Object-1.420.0-1.9.aarch64.rpm"
RPM_HASH = "ba024aef19c7906fe66d979e8065663958a0581b31437b4c9b8e203dfde0c7fdea89168ed4d20a313e031073cb9af9ba1038310f95ce2e256f54e5392051f449"

RPROVIDES:${PN} += "perl-Set--Object \
perl-Set--Object--Weak \
perl-Set-Object"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
