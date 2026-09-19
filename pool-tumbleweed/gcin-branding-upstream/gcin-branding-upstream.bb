SUMMARY = "Upstream branding of gcin"
DESCRIPTION = "This package provides upstream look and feel for gcin"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-branding-upstream-2.9.0-7.9.aarch64.rpm"
RPM_HASH = "9534fbb26964821c5f1f72f20a3f84c1c13aeb70c51c96eb9499f6ac95e5d8a60afdb0832a92676ecec281b282b3e0d3b55375646280eb4e1a517cd9a9981ecf"

RPROVIDES:${PN} += "gcin-branding \
gcin-branding-upstream"

RDEPENDS:${PN} += "gcin"

inherit rpm
