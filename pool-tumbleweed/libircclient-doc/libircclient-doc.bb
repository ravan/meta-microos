SUMMARY = "Documentation for libircclient"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient-doc-1.10-2.9.aarch64.rpm"
RPM_HASH = "f525106a8533e6211608f8faba6f13bdf83979f443ee038c5a9d5baf28aaba9509d8a9cf65ae3df39b2b58e42b95bbc31ed0e785303a54af936492e4cfe27542"

RPROVIDES:${PN} += "libircclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
