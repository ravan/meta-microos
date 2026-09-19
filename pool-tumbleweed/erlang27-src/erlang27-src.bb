SUMMARY = "Erlang/OTP applications sources"
DESCRIPTION = "Erlang sources for all the applications in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "e108019a071b717019272d19c788c9922f0c46fe2f8add280520d72efe2f15e5414343afe35a1239cc2ee6907d9a07925eb93e6999f737698421903a88b70513"

RPROVIDES:${PN} += "erlang-src \
erlang27-src"

RDEPENDS:${PN} += "erlang27"

inherit rpm
