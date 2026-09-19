SUMMARY = "Default terminology theme(Flat)"
DESCRIPTION = "The default theme for terminology install when using openSUSE branding."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-Flat-1.13.0-1.13.aarch64.rpm"
RPM_HASH = "6815092f7a89b045eccb93544e20a3143e83eb3aa89143d6dbbd7e2ca4026fd9d791b2aa375ac3a0345cef61b44e3bd977e13259a293ad05b9812c79fb585746"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-Flat"

RDEPENDS:${PN} += ""

inherit rpm
