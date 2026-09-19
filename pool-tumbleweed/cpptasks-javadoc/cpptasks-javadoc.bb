SUMMARY = "Javadoc for cpptasks"
DESCRIPTION = "Javadoc documentation for Javadoc for cpptasks."
LICENSE = "Apache-2.0"

PV = "1.0b5"

RPM_NAME = "cpptasks-javadoc-1.0b5-7.26.noarch.rpm"
RPM_HASH = "eafc7db77d0938d93f6bb38e79f0c4b9b5c738d289fb456b0715e9c4d73974d4b8b6259205db6f128e14169044ddeb642e4a3922f43954f8115bb38b506f54ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpptasks-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
