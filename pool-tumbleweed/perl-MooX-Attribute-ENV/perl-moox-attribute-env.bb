SUMMARY = "Allow Moo attributes to get their values from %ENV"
DESCRIPTION = "This is a Moo extension. It allows other attributes for Moo/has. If any of \
these are given, then Moo/BUILDARGS is wrapped so that values for object \
attributes can, if not supplied in the normal construction process, come \
from the environment. \
 \
The environment will be searched for either the given case, or upper case, \
version of the names discussed below. \
 \
When a prefix is mentioned, it will be prepended to the mentioned name, \
with a '_' in between."
LICENSE = "Artistic-2.0"

PV = "0.04"

RPM_NAME = "perl-MooX-Attribute-ENV-0.04-1.24.noarch.rpm"
RPM_HASH = "f5e56fafe7787c3e167e33cd307bf667c15309d577eb948a0e0c3cd123ab34c80daf33c1cc10b7dfb0ee65d2189d885ed899612214f5e5c7bddae27a3b4618d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Attribute--ENV \
perl-MooX-Attribute-ENV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo"

inherit rpm
