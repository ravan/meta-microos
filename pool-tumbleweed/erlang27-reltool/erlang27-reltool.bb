SUMMARY = "A release management tool"
DESCRIPTION = "Reltool is a release management tool. It analyses a given \
Erlang/OTP installation and determines various dependencies \
between applications. The graphical frontend depicts the \
dependencies and enables interactive customization of a \
target system. The backend provides a batch interface \
for generation of customized target systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-reltool-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "d0a76a4afe753908ec31d4d29b02304ac1f3c4cca38e27b962279fc226da776ce329dc432c079fdaed0b7d6ae6821afa7b8fe22823ec7ddd399c6b090bcbc0e2"

RPROVIDES:${PN} += "erlang-reltool \
erlang27-reltool"

RDEPENDS:${PN} += "erlang27 \
erlang27-wx"

inherit rpm
