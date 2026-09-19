SUMMARY = "Dictionary files for libime"
DESCRIPTION = "This package provides dictionary files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.13"

RPM_NAME = "libime-dicts-1.1.13-1.5.aarch64.rpm"
RPM_HASH = "67e74d3880c0d0735495a8055aec4f8b7492587e6f9d76499f74c1e37eaeb66cbfc2e57f44df7e15f27f90ac300e68eb7c47cb41fcbd583af8f0d834e03e6bc8"

RPROVIDES:${PN} += "libime-dicts"

RDEPENDS:${PN} += ""

inherit rpm
