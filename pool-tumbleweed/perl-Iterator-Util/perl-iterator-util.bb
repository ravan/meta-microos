SUMMARY = "Essential utilities for the Iterator class"
DESCRIPTION = "This module implements many useful functions for creating and manipulating \
iterator objects. \
 \
An 'iterator' is an object, represented as a code block that generates the \
'next value' of a sequence, and generally implemented as a closure. For \
further information, including a tutorial on using iterator objects, see \
the the Iterator manpage documentation."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Iterator-Util-0.02-14.42.noarch.rpm"
RPM_HASH = "8b2ec67ae7c32bd2787159d2a340a289a56083c87d5016933cbf232fbdb906a97b7f92ef59f41343ad0a07805bda0d4ce99bf2ad4e35f4e50150899ee0e3ad9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Iterator--Util \
perl-Iterator-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exception--Class \
perl-Iterator"

inherit rpm
