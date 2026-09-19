SUMMARY = "Tie to an existing object."
DESCRIPTION = "While the perldoc/tie manpage allows tying to an arbitrary object, the \
class in question must support this in it's implementation of 'TIEHASH', \
'TIEARRAY' or whatever. \
 \
This class provides a very tie constructor that simply returns the object \
it was given as it's first argument. \
 \
This way side effects of calling '$object->TIEHASH' are avoided. \
 \
This is used in the Data::Visitor manpage in order to tie a variable to an \
already existing object. This is also useful for cloning, when you want to \
clone the internal state object instead of going through the tie interface \
for that variable."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Tie-ToObject-0.03-13.42.noarch.rpm"
RPM_HASH = "ca263b8bb93a553ea10c8c9f49964eeb7438acf5e8f9ee2431dd6d6af2241a11f44424d0b30209ae5a53dadcb6950e91d3514d2388bc6935f359483897793f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--ToObject \
perl-Tie-ToObject"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--use--ok"

inherit rpm
