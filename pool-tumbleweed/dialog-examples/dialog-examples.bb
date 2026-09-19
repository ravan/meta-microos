SUMMARY = "Examples of using dialog tool"
DESCRIPTION = "Examples of using menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-examples-1.3-14.1.noarch.rpm"
RPM_HASH = "3e6370539889ef5071359c3b2c84f8408485f3e3264c6a2503dac298c3a34968226a273019832fcbdef8fb56d731e29981469e6b4d65ac14a5284353c8a526ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dialog-examples"

RDEPENDS:${PN} += "dialog"

inherit rpm
