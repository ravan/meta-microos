SUMMARY = "Erlang Java Interface"
DESCRIPTION = "JInterface module for accessing erlang from Java"
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-jinterface-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "e132b9c045a77b34bb5e8e5b10d559ed17941492e966c0b47a84836d49c933a3ebec039e2f7f6586db1c66236ae4392648bbf5e8f4fe73cb9ed7077c08d74981"

RPROVIDES:${PN} += "erlang-jinterface \
erlang27-jinterface"

RDEPENDS:${PN} += "erlang27 \
java"

inherit rpm
