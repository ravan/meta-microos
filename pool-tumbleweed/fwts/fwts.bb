SUMMARY = "Firmware Test Suite"
DESCRIPTION = "The FirmWare Test Suite (fwts) is a tool to do automatic testing of a PC's \
firmware. There can be a lot of subtle or vexing Linux Kernel/firmware issues \
caused when firmware is buggy, so it's useful to have a tool that can \
automatically check for common BIOS and ACPI errors. Where possible the tool \
will give some form of advice on how to fix issues or workaround firmware \
issues."
LICENSE = "GPL-2.0-or-later"

PV = "26.07.00"

RPM_NAME = "fwts-26.07.00-1.2.aarch64.rpm"
RPM_HASH = "a29fd267224f1255709c1933e48a3ff8f6cba88b609d09e7d66bc3216ff97afebbfe64fad084550bb4137bc2d9b19e569eb90c0837a02ba9ec1d448d4002be2e"

RPROVIDES:${PN} += "fwts \
libfwts.so.1 \
libfwtsacpica.so.1 \
libfwtsiasl.so.1"

RDEPENDS:${PN} += "bash-completion \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfdt.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpci.so.3 \
libz.so.1"

inherit rpm
