SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdbusaddons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "93cc884572bc88fc260e370042e4310dcf852bc9c0b4ff4666acecabb336a487859d33add47d21fdb2bd901f04e5773470798393b55f3be68fe761e801dec55d"

RPROVIDES:${PN} += "kf6-kdbusaddons"

RDEPENDS:${PN} += ""

inherit rpm
