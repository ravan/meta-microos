SUMMARY = "GAP: Almost Crystallographic Groups"
DESCRIPTION = "The AClib package contains a library of almost crystallographic \
groups and a some algorithms to compute with these groups. A group is \
called almost crystallographic if it is finitely generated \
nilpotent-by-finite and has no non-trivial finite normal subgroups."
LICENSE = "Artistic-2.0"

PV = "1.4"

RPM_NAME = "gap-aclib-1.4-1.1.noarch.rpm"
RPM_HASH = "929f84b899ceeda21d15ac0fd1577dbed51797fcee7fa5da635ce4d4429b47397a174f89c0b0f9325d0e4d777455d5bbc09227c65dddd1e002cf62c9cfcbcd8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-aclib"

RDEPENDS:${PN} += "gap-core \
gap-polycyclic"

inherit rpm
