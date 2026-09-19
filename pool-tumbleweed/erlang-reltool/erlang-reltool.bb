SUMMARY = "A release management tool"
DESCRIPTION = "Reltool is a release management tool. It analyses a given \
Erlang/OTP installation and determines various dependencies \
between applications. The graphical frontend depicts the \
dependencies and enables interactive customization of a \
target system. The backend provides a batch interface \
for generation of customized target systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-reltool-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "d7084430b5c43fa6926e826ba06d08dbc5349de09bc685bba3d9896dd674124bb126ee170cdba6d20374d6e3c1aa86bd42eca06183e44d365b16ba1295ffc372"

RPROVIDES:${PN} += "erlang-reltool"

RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
