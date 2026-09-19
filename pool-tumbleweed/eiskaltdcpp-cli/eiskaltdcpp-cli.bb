SUMMARY = "CLI frontend for eiskaltdcpp"
DESCRIPTION = "This package contains the EiskaltDC++ CLI (command-line interface) written in Perl. \
This program is used to control the EiskaltDC++ daemon via the JSON-RPC protocol. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-cli-2.4.2-6.2.aarch64.rpm"
RPM_HASH = "74224f1569959c4b3a942dd95f02c324ce2e896bdbae139212027400a696e67072f92ff9c8abf25010a2e04c143c90baa11c41bcc5be8355a0ee792ad7c13e52"

RPROVIDES:${PN} += "eiskaltdcpp-cli"

RDEPENDS:${PN} += "/usr/bin/perl \
eiskaltdcpp-common \
perl-JSON--RPC"

inherit rpm
