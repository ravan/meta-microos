SUMMARY = "Minimalist class construction"
DESCRIPTION = "This module offers a minimalist class construction kit in around 120 lines \
of code. Here is a list of features: \
 \
  * defines attributes via import arguments \
 \
  * generates read-write accessors \
 \
  * supports lazy attribute defaults \
 \
  * supports custom accessors \
 \
  * superclass provides a standard 'new' constructor \
 \
  * 'new' takes a hash reference or list of key/value pairs \
 \
  * 'new' supports providing 'BUILDARGS' to customize constructor options \
 \
  * 'new' calls 'BUILD' for each class from parent to child \
 \
  * superclass provides a 'DESTROY' method \
 \
  * 'DESTROY' calls 'DEMOLISH' for each class from child to parent \
 \
Multiple-inheritance is possible, with superclass order determined via \
mro::get_linear_isa. \
 \
It uses no non-core modules for any recent Perl. On Perls older than v5.10 \
it requires MRO::Compat. On Perls older than v5.14, it requires \
Devel::GlobalDestruction."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "perl-Class-Tiny-1.8.0-1.7.noarch.rpm"
RPM_HASH = "315beb8f7d5245f07cecafa4a99eaf581ddcfc20e14b0fed2c7152e044b16dd61a839806d9affb5e637e45d814078e03bb7636965a6b9a341b459fbdec7800c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Tiny \
perl-Class--Tiny--Object \
perl-Class-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
