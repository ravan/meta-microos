SUMMARY = "Erlang Java Interface"
DESCRIPTION = "JInterface module for accessing erlang from Java"
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-jinterface-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "858c2e232110bd224e3e7c492f524b09d91c4dfdcd8b4907b234019e0abd80d7abfae1f028541c66816cb85dea16e28628da6f731274491868f4a79945cca76e"

RPROVIDES:${PN} += "erlang-jinterface"

RDEPENDS:${PN} += "erlang \
java"

inherit rpm
