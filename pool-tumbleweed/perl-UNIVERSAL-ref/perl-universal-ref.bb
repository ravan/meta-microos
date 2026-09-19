SUMMARY = "Turns ref() into a multimethod"
DESCRIPTION = "This module changes the behavior of the builtin function ref(). If ref() is \
called on an object that has requested an overloaded ref, the object's \
'->ref' method will be called and its return value used instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-UNIVERSAL-ref-0.14-2.14.aarch64.rpm"
RPM_HASH = "7e24971481e9fc84c076777d3d93fe61723ebad879493ccd7d638d6711c0490eff709381f752411b8e5b5748e0f097b41cf3dcd92e9b14689a9d1d810c0dd082"

RPROVIDES:${PN} += "perl-UNIVERSAL--ref \
perl-UNIVERSAL-ref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-B--Utils"

inherit rpm
