SUMMARY = "Controlled fork() bomber for testing heavy system load"
DESCRIPTION = "Classic Unix fork() bomber. Includes CPU hanger, memory allocator, memory \
toucher and zombie dance team. You can test how will your computer behave under \
heavy CPU, process, memory load. Linux 2.4 and FreeBSD 5.4 don't survive \
classic forkbomb. Forkbomb is also useful as realloc() benchmark."
LICENSE = "SUSE-Public-Domain"

PV = "1.4"

RPM_NAME = "forkbomb-1.4-3.31.aarch64.rpm"
RPM_HASH = "cf51bad4d97bf0c8a568ae9c7cb8c4b5f78bfdfb3e48cd616d48157e03a80959b6bdf983c8e083c8decbefafab848ebaa30aa36590a7496df5868f7db512a14b"

RPROVIDES:${PN} += "forkbomb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
