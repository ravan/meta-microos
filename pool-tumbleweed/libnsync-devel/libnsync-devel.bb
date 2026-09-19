SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "C/C++ library that exports various synchronization primitives: \
	locks \
	condition variables \
	run-once initialization \
	waitable counter (useful for barriers) \
	waitable bit (useful for cancellation, or other conditions)"
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "libnsync-devel-1.29.2-1.4.aarch64.rpm"
RPM_HASH = "0e8970ae1e36a99608c7255a3921261769d19bc9760ef1c41367c776ef7cdf0036b6f7b9810ae163fb71d8173de448cd59f51e26c1bf11471e954ab96929d92f"

RPROVIDES:${PN} += "cmake-nsync \
cmake-nsync-cpp \
libnsync-devel"

RDEPENDS:${PN} += "libnsync-cpp1 \
libnsync1"

inherit rpm
