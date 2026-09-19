SUMMARY = "Development files for krdc"
DESCRIPTION = "Development libraries and headers needed to build software using krdc"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "krdc-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0c5806ad409b4d71ad6661b1c8d03789a17f08a86959124cb14b6fc33210f7dc5c7d8cedf6249884691a2e4e0756203ef92227cc11891b9f65a368858156df96"

RPROVIDES:${PN} += "krdc-devel"

RDEPENDS:${PN} += "krdc"

inherit rpm
