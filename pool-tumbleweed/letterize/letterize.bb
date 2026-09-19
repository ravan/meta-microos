SUMMARY = "Find pronounceable letter mnemonics for phone numbers"
DESCRIPTION = "This program uses a table of pronounceable letter-triples derived from a \
dictionary scan. Each potential mnemonic must be such that all of its \
letter-triples are in the table to be emitted. About 30% of possible triples \
are considered pronounceable. A typical 7-digit phone number has 19,683 \
possible mnemonics, but this test usually cuts the list down to a few hundred \
or so, a reasonable number to eyeball-check. For some numbers, the list will, \
sadly, be empty."
LICENSE = "BSD-2-Clause"

PV = "1.5"

RPM_NAME = "letterize-1.5-1.4.aarch64.rpm"
RPM_HASH = "819d9e5e6d3bb2b3ee70c50c1e5c4a18e14a4fdc5e377a180cc2c0bfa6449a6b3080262852f5ad936ca71c96e21b5fa7dc9a5a37f73448c560f1385aa3799a91"

RPROVIDES:${PN} += "letterize"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
