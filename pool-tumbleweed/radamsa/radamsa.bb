SUMMARY = "A test case generator for robustness testing, aka a fuzzer"
DESCRIPTION = "Radamsa is a test case generator for robustness testing, aka a fuzzer. It \
can be used to test how well a program can stand malformed and potentially \
malicious inputs. It operates based on given sample inputs and thus \
requires minimal effort to set up. The main selling points of radamsa are \
that it is easy to use, contains several old and new fuzzing algorithms, is \
easy to script from command line and has already been used to find a slew \
of bugs in programs that actually matter."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "radamsa-0.7-1.11.aarch64.rpm"
RPM_HASH = "426e5f91a9fbf56499e6d2bdee162582d92fa8b9d72abe67af6ce0110ea141583d3f8e9a0393777694ae1d0224b810f21930b2747d819bc5b6a889c35a81c654"

RPROVIDES:${PN} += "radamsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
