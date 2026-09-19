SUMMARY = "An event tracer for Erlang programs"
DESCRIPTION = "An event tracer for Erlang programs."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-et-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "171c5ab5b2396fd66a4ab2eed871c03cd3ad4c5aa4976f8d06b2f88a8f36811948ed707412790bcc93e605bf1bfa8641c0dfb64e39f229d17e22f5b5427c88f9"

RPROVIDES:${PN} += "erlang-et \
erlang27-et"

RDEPENDS:${PN} += "erlang27 \
erlang27-wx"

inherit rpm
