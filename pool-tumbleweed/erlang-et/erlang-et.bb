SUMMARY = "An event tracer for Erlang programs"
DESCRIPTION = "An event tracer for Erlang programs."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-et-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "87f0d5355cf954f01bb28397064fa8bce058f5ee776798d3712ef8c6e68fe633aa323d9f5243fd566f60c97ba2275a28f315d6e13b8800a005fd30faf5433c01"

RPROVIDES:${PN} += "erlang-et"

RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
