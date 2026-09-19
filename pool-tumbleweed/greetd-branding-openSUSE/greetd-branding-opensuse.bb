SUMMARY = "openSUSE branding of greetd"
DESCRIPTION = "This package provides the openSUSE look and feel for greetd."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "greetd-branding-openSUSE-0.17.0-1.4.noarch.rpm"
RPM_HASH = "5ff0fcfe31a92a9df1b18592712086c426e656206bd52efe3d613e176f242ddf758fa0181e62214d87bdd08c26a3c0df8606f2cffa53c9820ada48c8288edda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-greetd-branding-openSUSE \
greetd-branding \
greetd-branding-openSUSE"

RDEPENDS:${PN} += "group-greeter \
user-greeter"

inherit rpm
