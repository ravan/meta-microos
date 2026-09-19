SUMMARY = "Replacement game files for Heretic game engines"
DESCRIPTION = "Blasphemer aims to create a free content package for the Heretic engine, \
with a theme of metal-inspired dark fantasy."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "blasphemer-0.1.8-1.9.noarch.rpm"
RPM_HASH = "93359426b33420cca945c99bee0bcfdd71b8f8126495c78b03ac827fdf450ad8a99f58684cf9b81fdbcec1f86f4ce6ba82217618e665a0643f74b98bf9492369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blasphemer"

RDEPENDS:${PN} += ""

inherit rpm
