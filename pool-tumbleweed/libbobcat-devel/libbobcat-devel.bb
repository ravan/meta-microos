SUMMARY = "Headers and documentation for the Bobcat library"
DESCRIPTION = "Headers and documentation of classes defined in the Bobcat library."
LICENSE = "GPL-3.0-only"

PV = "6.15.01"

RPM_NAME = "libbobcat-devel-6.15.01-1.1.aarch64.rpm"
RPM_HASH = "7f9cb4315da16d6cd9288d49ef13bde24d4e2f427ee97198143dc431db77263efa891b6764549c78873714dbddff0c02c2cd7e680c1bfefd2b3a30f733507971"

RPROVIDES:${PN} += "libbobcat-devel"

RDEPENDS:${PN} += "libbobcat6"

inherit rpm
