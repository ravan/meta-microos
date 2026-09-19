SUMMARY = "Object-oriented syntax sugar for File::Basename"
DESCRIPTION = "File::Basename::Object is an object-oriented wrapper around \
File::Basename. The goal is to allow pathnames to be presented and \
manipulated easily. \
 \
 \
 \
Authors: \
-------- \
    Tyler 'Crackerjack' MacDonald <japh@crackerjack.net>"
LICENSE = "Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-File-Basename-Object-0.01-64.46.aarch64.rpm"
RPM_HASH = "91adcb4315e77348cf03523b4b143c7e9ba25154ee69671b8df950c38f00cd40c9d00ba806a84c77c31d7d31783b1842401a6fb9e4d65892f936cc2d53a27349"

RPROVIDES:${PN} += "perl-File--Basename--Object \
perl-File-Basename-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
