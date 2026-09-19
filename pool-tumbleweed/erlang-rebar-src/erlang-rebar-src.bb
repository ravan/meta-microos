SUMMARY = "A sophisticated build-tool for Erlang projects that follows OTP principles"
DESCRIPTION = "rebar is an Erlang build tool that makes it easy to compile and \
test Erlang applications, port drivers and releases."
LICENSE = "Apache-2.0"

PV = "2.6.4+git20180201.b6d3094"

RPM_NAME = "erlang-rebar-src-2.6.4+git20180201.b6d3094-6.8.aarch64.rpm"
RPM_HASH = "51933bb1400a33693c68817cb2e822d95d9181e491e70698e4991b740838091b9aa4e91261f987bcdb8d5d465a92b29f153704954a807d3c0cad7654a571d9f4"

RPROVIDES:${PN} += "erlang-rebar-devel \
erlang-rebar-src"

RDEPENDS:${PN} += "erlang-rebar"

inherit rpm
