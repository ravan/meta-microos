SUMMARY = "Erlang/OTP jinterface application sources"
DESCRIPTION = "Erlang sources for the jinterface application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-jinterface-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "5e4bc8528ab949daf98f0d5857283ff7923c9813ac10ffa832e9ef8762a55e05ffd8cfaafd941bdbf1a497c3a3ae15629e59a0037fd31e0f104c71dc8aa4e9a5"

RPROVIDES:${PN} += "erlang-jinterface-src \
erlang27-jinterface-src"

RDEPENDS:${PN} += "erlang27-jinterface"

inherit rpm
