SUMMARY = "Polymorphic data cloning"
DESCRIPTION = "'Data::Clone' does data cloning, i.e. copies things recursively. This is \
smart so that it works with not only non-blessed references, but also with \
blessed references (i.e. objects). When 'clone()' finds an object, it calls \
a 'clone' method of the object if the object has a 'clone', otherwise it \
makes a surface copy of the object. That is, this module does polymorphic \
data cloning. \
 \
Although there are several modules on CPAN which can clone data, this \
module has a different cloning policy from almost all of them. See Cloning \
policy and Comparison to other cloning modules for details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.6.0"

RPM_NAME = "perl-Data-Clone-0.6.0-2.14.aarch64.rpm"
RPM_HASH = "709fa66e961526e4d4c2ad7ebb9becd993ee1bf43f02eb6df93099beca1789b90466a58cbe97b89c528c9d6f5fe025a94d52ec428a180be56a67da33a43250aa"

RPROVIDES:${PN} += "perl-Data--Clone \
perl-Data-Clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
