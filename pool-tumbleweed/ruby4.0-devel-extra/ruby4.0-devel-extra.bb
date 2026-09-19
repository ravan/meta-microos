SUMMARY = "Special development files of ruby, normally not installed"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "BSD-2-Clause | Ruby"

PV = "4.0.6"

RPM_NAME = "ruby4.0-devel-extra-4.0.6-2.1.aarch64.rpm"
RPM_HASH = "95253285d304aa111c2da38e9aa56c19aa44345de7a2f767628405ff25bf1680a6574cbaeac45fa564d1b94fe396df0112f498b73ba097039440593cc693cb39"

RPROVIDES:${PN} += "ruby4.0-devel-extra"

RDEPENDS:${PN} += "ruby4.0-devel"

inherit rpm
