SUMMARY = "Runtime library to encode performance events for use by perf tool"
DESCRIPTION = "This package provides a library that can be used to encode events into the \
format required by the operating systems performance monitoring subsystem. \
The library does not make any performance monitoring system calls, it simply \
provides a method to convert an event name, expressed as a string, to an event \
encoding. The user of the library may use this event encoding in a subsequent \
system call. \
 \
The current libpfm4 provides support for the perf_events interface which was \
introduced in Linux v2.6.31."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm4-4.13.0-2.8.aarch64.rpm"
RPM_HASH = "2f25ed3b0352840273e9a671d7b9e44e49911ee780525da8f0aebb83ad70425c6053858730474600a269f41bf88cc3c764e9f72077f7c8fffaaa4110fe2bdd9a"

RPROVIDES:${PN} += "libpfm.so.4 \
libpfm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
