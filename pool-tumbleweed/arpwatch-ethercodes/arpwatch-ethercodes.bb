SUMMARY = "Ethercodes Data for arpwatch"
DESCRIPTION = "Fetch OUI and company ID data from IEEE.org prepared for arpwatch."
LICENSE = "BSD-3-Clause"

PV = "20250404"

RPM_NAME = "arpwatch-ethercodes-20250404-1.4.noarch.rpm"
RPM_HASH = "4135e26e1cc83bdadc13556bc7e6833f9618953b0fcc28c98dfd600727c42e3ec555a401d43e7ddad9d5714d382828bffc29729375107175adfb3feeb36229db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arpwatch-ethercodes"

RDEPENDS:${PN} += ""

inherit rpm
