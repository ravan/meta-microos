SUMMARY = "Fortran library for fast updates of QR and Cholesky decompositions"
DESCRIPTION = "qrupdate is a Fortran library for fast updates of QR and Cholesky decompositions"
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-1.1.2-3.41.aarch64.rpm"
RPM_HASH = "17e62f842f4176c97e8333023c2b73096d2659a79792187e51257da6594310cf913ea744befe0d697bf292ac7b5d6740e846b637b9cb5283a2fdf7bca26de5f8"

RPROVIDES:${PN} += "qrupdate"

RDEPENDS:${PN} += ""

inherit rpm
