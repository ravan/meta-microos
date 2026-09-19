SUMMARY = "Documentation for Icinga 2"
DESCRIPTION = "This subpackage provides documentation for Icinga 2."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "icinga2-doc-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "c6b1973b7b2ccb7ec65dc1d556629679fe1ca1e98b1610968f4bfb88d131b12da10696290f87e8fc1c5ea3819383e9e3f912528267f91d7f9b8b07d83b658595"

RPROVIDES:${PN} += "icinga2-doc"

RDEPENDS:${PN} += ""

inherit rpm
