SUMMARY = "Native application for the browserpass browser extension"
DESCRIPTION = "This is a host application for browserpass browser extension providing it \
access to your password store. The communication is handled through Native \
Messaging API."
LICENSE = "ISC"

PV = "3.1.0"

RPM_NAME = "browserpass-native-3.1.0-3.8.aarch64.rpm"
RPM_HASH = "cd58053da143a76338e827b46d8890a2fedbba07be4e07b180394cd54476cc91333b8a82361b1fe9eb776f489ddd104165833d2ab2116b364a29b3d4c73163fe"

RPROVIDES:${PN} += "browserpass-native"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
