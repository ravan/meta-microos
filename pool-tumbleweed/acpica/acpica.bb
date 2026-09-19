SUMMARY = "A set of tools to display and debug BIOS ACPI tables"
DESCRIPTION = "The included tools share the same code as it is used in the ACPI \
implementation of the kernel. The code of the acpica project is exactly \
the same as the ACPI parser and interpreter code of the kernel and the \
code gets synced regularly from the acpica project into the kernel. \
E.g. if you identify bugs in the kernel's ACPI implementation it might \
be easier to debug them in userspace if possible. If the bug is part of \
the acpica code, it has to be submitted to the acpica project to get \
merged into the mainline kernel sources. \
 \
iasl compiles ASL (ACPI Source Language) into AML (ACPI Machine \
Language). This AML is suitable for inclusion as a DSDT in system \
firmware. It also can disassemble AML, for debugging purposes."
LICENSE = "GPL-2.0-only"

PV = "20260408"

RPM_NAME = "acpica-20260408-2.4.aarch64.rpm"
RPM_HASH = "3f859f15f8543ae5ded17e2c341f48372b95c82c36f87d8e0abeeffe54d0c5a4e8645b59b0b61f6aa1756f24732a322d72697ef4f195f4fa09f865ae274ece13"

RPROVIDES:${PN} += "acpica \
iasl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
