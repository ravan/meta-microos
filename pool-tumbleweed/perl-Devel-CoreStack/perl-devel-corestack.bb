SUMMARY = "try to generate a stack dump from a core file"
DESCRIPTION = "This module attempts to generate a stack dump from a core file by \
locating the best available debugger (if any) and running it with the \
appropriate arguments and command script. \
 \
 \
 \
Authors: \
-------- \
    Alligator Descartes <descarte@hermetica.com> \
    Tim Bunce"
LICENSE = "Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-Devel-CoreStack-1.3-306.45.aarch64.rpm"
RPM_HASH = "b086c8b93d779194ee557090a697226579ab10e1afa6f73a7b45ced0ccde1c7b866a7b941b2c7be425e1f7d031e0aa174978ec4cbf9cc58bb2d0751e5ca72317"

RPROVIDES:${PN} += "Devel-CoreStack \
perl-Devel--CoreStack \
perl-Devel-CoreStack"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
