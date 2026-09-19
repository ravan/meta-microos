SUMMARY = "Grommunio-branded error pages for web servers"
DESCRIPTION = "Grommunio-branded error pages for web servers."
LICENSE = "CC-BY-SA-4.0"

PV = "1.0.6.9c50afb"

RPM_NAME = "grommunio-error-pages-1.0.6.9c50afb-1.6.noarch.rpm"
RPM_HASH = "d0ef202c56cb82586dad287db488b6c5fe68da4c9a37aa707d0c3fa9194995f155b9c32344bf5e7a7636b2dd9f0d7c79adad05cadb5545a7991275c003e9fac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grommunio-error-pages"

RDEPENDS:${PN} += ""

inherit rpm
