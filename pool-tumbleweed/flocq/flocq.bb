SUMMARY = "Formalization of floating point numbers for Coq"
DESCRIPTION = "Flocq (Floats for Coq) is a floating-point formalization for the Coq \
system.  It provides a comprehensive library of theorems on a \
multi-radix multi-precision arithmetic.  It also supports efficient \
numerical computations inside Coq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.2"

RPM_NAME = "flocq-4.2.2-1.7.aarch64.rpm"
RPM_HASH = "508addc61208ccba2c29906ad54a6c5ade96935b7404880e7971ac6297d97b365807aba5fa1784d07ea3bd760f2163ade7a5c832f0eba591e70d6fef86892112"

RPROVIDES:${PN} += "flocq"

RDEPENDS:${PN} += "coq \
rocq-stdlib"

inherit rpm
