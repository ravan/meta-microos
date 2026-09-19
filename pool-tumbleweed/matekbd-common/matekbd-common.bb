SUMMARY = "MATE Desktop keyboard configuration common files"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "matekbd-common-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "cbad2e7e5413a66793dc681a31cb3b285fbaf168a311ea6edc967d0aa0792a2277dfa9372fa7ad66a0f7151c5525c79cc411b953b2cf4eb4b6fc9470088d293a"

RPROVIDES:${PN} += "matekbd-common"

RDEPENDS:${PN} += ""

inherit rpm
