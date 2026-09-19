SUMMARY = "inside-out objects with Moose"
DESCRIPTION = "MooseX::InsideOut provides metaroles for inside-out objects. That is, it \
sets up attribute slot storage somewhere other than inside '$self'. This \
means that you can extend non-Moose classes, whose internals you either \
don't want to care about or aren't hash-based."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.106"

RPM_NAME = "perl-MooseX-InsideOut-0.106-9.41.noarch.rpm"
RPM_HASH = "9c88e08e1928348df9610c6ca5d8737c38f6983c4d66e4b01ad307cdea62c96039129e50ee7b7d00bc4edd9a8d6e8a4736493e14c5b5209126321f7f3612e2e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--InsideOut \
perl-MooseX--InsideOut--Role--Meta--Instance \
perl-MooseX-InsideOut"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--MOP \
perl-Hash--Util--FieldHash--Compat \
perl-Moose \
perl-namespace--clean"

inherit rpm
