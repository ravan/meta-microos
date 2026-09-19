SUMMARY = "Make chained accessors"
DESCRIPTION = "A chained accessor is one that always returns the object when called with \
parameters (to set), and the value of the field when called with no \
arguments. \
 \
This module subclasses Class::Accessor in order to provide the same \
mk_accessors interface."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-Class-Accessor-Chained-0.10.0-1.1.noarch.rpm"
RPM_HASH = "51542208177ea46b2c540c5152ded257982258140054c6423e7226df18b8095740505e3257c2899a50370ae3e314b33dced4e2db0506df974a0c287cd760cfaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor--Chained \
perl-Class--Accessor--Chained--Fast \
perl-Class-Accessor-Chained"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor"

inherit rpm
