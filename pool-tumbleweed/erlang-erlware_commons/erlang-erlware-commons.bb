SUMMARY = "A project focused on all aspects of reusable Erlang components"
DESCRIPTION = "Erlware Commons is an Erlware project focused on all aspects of reusable Erlang components."
LICENSE = "Apache-2.0 & MIT"

PV = "1.6.0"

RPM_NAME = "erlang-erlware_commons-1.6.0-3.9.aarch64.rpm"
RPM_HASH = "6f09bc8dedee82820ed8ca6013bcf7ca6aae95631a0aab683e13935c3c205726d381c6bf2624296a95f7017c568fac1cb88befc60edf2a6268640b090a2e49e5"

RPROVIDES:${PN} += "erlang-erlware-commons"

RDEPENDS:${PN} += "erlang \
erlang-cf"

inherit rpm
