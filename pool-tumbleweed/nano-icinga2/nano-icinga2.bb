SUMMARY = "Nano syntax highlighting for icinga2"
DESCRIPTION = "Provides Nano syntax highlighting for icinga2."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "nano-icinga2-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "c2aa353bc42be01a50f6471c021a3a63ef40c4d4c7469874b727823d90089faefcd000c7084be6da00743c24e576df8970472b17c5f1c61fc3e82513b2a43324"

RPROVIDES:${PN} += "nano-icinga2"

RDEPENDS:${PN} += "nano"

inherit rpm
