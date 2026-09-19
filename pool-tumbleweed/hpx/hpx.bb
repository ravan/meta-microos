SUMMARY = "General Purpose C++ Runtime System"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale."
LICENSE = "BSL-1.0"

PV = "1.11.0"

RPM_NAME = "hpx-1.11.0-1.6.aarch64.rpm"
RPM_HASH = "761a4b674ab933e51b1d67a1e9d998ed789565468a69ccb31aaebcc4da90e8f07eb272338d6dac5a3a26975a7a8df65e583c3e1a5555804d50019384cab18b5b"

RPROVIDES:${PN} += "hpx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
libhpx1"

inherit rpm
