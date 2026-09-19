SUMMARY = "Go packages for low-level interaction with the operating system"
DESCRIPTION = "This repository holds supplemental Go packages for low-level interactions with \
the operating system."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git20200420.1957bb5"

RPM_NAME = "golang-org-x-sys-0.0.0+git20200420.1957bb5-1.32.aarch64.rpm"
RPM_HASH = "a3a50f61099ab177b46bfe9cdea07dfbfdc5814225d57713a7432747cf8576c27ae7b73a1a357ef9b76feb27b7c15d9c7339843d7ecf0a7635b67ac4565b1509"

RPROVIDES:${PN} += "golang-org-x-sys"

RDEPENDS:${PN} += ""

inherit rpm
