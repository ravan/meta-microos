SUMMARY = "The Schily 'make' program"
DESCRIPTION = "Smake executes command sequences based on relations of modification \
dates of files. The command sequences are taken from a set of rules \
found in a makefile or in the set of implicit rules. The argument \
target is typically a program that is to be built from the known \
rules."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "smake-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "a3c69f5ec39f7b4a23388e00bfe1e788d5d316a26a50436644933cd45bf81395770600cc5c22dcd253782754b421df31e0010c0c420c600da9b02ae3a4e17444"

RPROVIDES:${PN} += "smake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
