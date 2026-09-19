SUMMARY = "Optimized pure-perl Redis protocol parser/encoder (DEPRECATED)"
DESCRIPTION = "This is an empty subclass of Protocol::Redis. The optimizations it used to \
contain have been implemented in the base class. Consider \
Protocol::Redis::XS for faster parsing."
LICENSE = "Artistic-2.0"

PV = "0.4.0"

RPM_NAME = "perl-Protocol-Redis-Faster-0.4.0-1.5.noarch.rpm"
RPM_HASH = "1000b580f32149a75e1c540f5d112ae244cb7f34800f8bc917e2b6c59517943b8c08a4adeb395ae906bbcc89edd4b63e215f354f34f51a069f4a99e4109d12a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--Redis--Faster \
perl-Protocol-Redis-Faster"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Protocol--Redis \
perl-parent"

inherit rpm
