SUMMARY = "Development headers for uthash"
DESCRIPTION = "This package provides development headers for uthash, a hash table \
implementation for C structures."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "uthash-devel-2.3.0-1.15.noarch.rpm"
RPM_HASH = "a995cfbad9e5838a28e00ec0fec1d23bcf9c024c9ecf1df610107b941da1ce76c3e15720ca1d4e2ca0fd67fdb74cb5c969bcb3a5f4072771a374adc2aff42d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uthash-devel"

RDEPENDS:${PN} += ""

inherit rpm
