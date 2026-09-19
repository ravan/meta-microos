SUMMARY = "Erlang/OTP observer application sources"
DESCRIPTION = "Erlang sources for the observer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-observer-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "82cad4c2efc5282450ca05668388630e62fb1c2b567f83e6792fe273c9d925553b92d2755b28c89bfdb5e11ad7fb1cfe757e1f9e0c96083ed51fffc9dc0e28dd"

RPROVIDES:${PN} += "erlang-observer-src"

RDEPENDS:${PN} += "erlang-observer"

inherit rpm
