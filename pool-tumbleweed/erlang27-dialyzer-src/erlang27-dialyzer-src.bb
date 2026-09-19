SUMMARY = "Erlang/OTP dialyzer application sources"
DESCRIPTION = "Erlang sources for the dialyzer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-dialyzer-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "a8905b11c67c73459049b438f9db942584a8c5fd65554c8e65e9351cfa7e66fb3cd29079a602bf5a9529b8fc4faa374c52a85944ee225ce317d7ded8f1e42bbf"

RPROVIDES:${PN} += "erlang-dialyzer-src \
erlang27-dialyzer-src"

RDEPENDS:${PN} += "erlang27-dialyzer"

inherit rpm
