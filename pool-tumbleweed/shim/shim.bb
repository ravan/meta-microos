SUMMARY = "UEFI shim loader"
DESCRIPTION = "shim is a trivial EFI application that, when run, attempts to open and \
execute another application."
LICENSE = "BSD-2-Clause"

PV = "16.1"

RPM_NAME = "shim-16.1-4.2.aarch64.rpm"
RPM_HASH = "152d9c7801be09d0aef6bb69472b4110a4cc5fa7a6f02d3d2db90244a3cef6bd08520303e9806c22da9a5ea0a8f03ef45c8544728cc4b4c7bd70530a41ba286f"

RPROVIDES:${PN} += "shim"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
perl-Bootloader"

inherit rpm
