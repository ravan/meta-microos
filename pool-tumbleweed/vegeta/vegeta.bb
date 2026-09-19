SUMMARY = "HTTP load testing tool and library"
DESCRIPTION = "Vegeta is a versatile HTTP load testing tool built out of a need to drill HTTP \
services with a constant request rate. \
 \
Features: \
 \
* Usable as a command line tool and a Go library. \
* CLI designed with UNIX composability in mind. \
* Avoids nasty Coordinated Omission. \
* Extensive reporting functionality. \
* Simple to use for distributed load testing. \
* Easy to install and run (static binary, package managers, etc)."
LICENSE = "MIT"

PV = "12.13.0"

RPM_NAME = "vegeta-12.13.0-1.7.aarch64.rpm"
RPM_HASH = "4dff4a9c3eea4cce46b2ed8928f1213f87fe942fc95208b2572660525ec4e543aa1cc8b4a6cf6b221855c83f8d34516f2a92a8d9d6f329e7b08dd28965f45d3d"

RPROVIDES:${PN} += "vegeta"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
