SUMMARY = "Prints the linux logo on the text console"
DESCRIPTION = "The Linux logo on the text console, with colors and system information. \
Contains a number of built-in logos."
LICENSE = "GPL-2.0-only"

PV = "6.01"

RPM_NAME = "linux_logo-6.01-1.11.aarch64.rpm"
RPM_HASH = "e299ba884547883f6be431b6608169ab3ac320d0cfa6277b4bea216eec521a111c9ed4fb4e22a924ee12ff735aed1497e417d96593f070d04b134f9219c6e9a1"

RPROVIDES:${PN} += "linux-logo"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
