SUMMARY = "Windows Remote Shell"
DESCRIPTION = "This is a command line tool for the Windows Remote Shell protocol. \
It can be used to send shell commands to remote Windows hosts."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "winrs-2.8.1-5.1.noarch.rpm"
RPM_HASH = "6fd9a45e9da587326061b522c751aaa5c3826007369b137221baf015022b01e44cc48050a2f96be6265635dfd5b336d6a989b944b0cbd34dc45fe3fd996cb54d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "winrs"

RDEPENDS:${PN} += "/usr/bin/ruby \
openwsman-ruby"

inherit rpm
