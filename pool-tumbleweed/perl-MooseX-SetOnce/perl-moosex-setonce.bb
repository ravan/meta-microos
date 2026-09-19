SUMMARY = "Write-once, read-many attributes for Moose"
DESCRIPTION = "The 'SetOnce' attribute lets your class have attributes that are not lazy \
and not set, but that cannot be altered once set. \
 \
The logic is very simple: if you try to alter the value of an attribute \
with the SetOnce trait, either by accessor or writer, and the attribute has \
a value, it will throw an exception. \
 \
If the attribute has a clearer, you may clear the attribute and set it \
again."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.203"

RPM_NAME = "perl-MooseX-SetOnce-0.203-1.18.noarch.rpm"
RPM_HASH = "247d6c945d9a8fd5f73651fcccc1fdb907f9d63220f77b2de1c49e92ae8e76ad1f48853cd8728a748ce0129a54f862e61db41707e7e6c05f54385b78ca8c2ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Moose--Meta--Attribute--Custom--Trait--SetOnce \
perl-MooseX--SetOnce \
perl-MooseX--SetOnce--Accessor \
perl-MooseX--SetOnce--Attribute \
perl-MooseX-SetOnce"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose--Role"

inherit rpm
