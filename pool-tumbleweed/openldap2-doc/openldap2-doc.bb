SUMMARY = "OpenLDAP Documentation"
DESCRIPTION = "The OpenLDAP Admin Guide plus a set of OpenLDAP related IETF internet drafts."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-doc-2.6.13-1.6.noarch.rpm"
RPM_HASH = "289511c419cf4093fdc120362e9be535798a64f2cc2e05142781cc5bc8af4c272c7def4bc67cdeb4fa0c6d511207b5ec696f9d32fe1b531f68950ae1917a1f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openldap2-/usr/share/doc/packages/openldap2/drafts/README \
openldap2-doc"

RDEPENDS:${PN} += ""

inherit rpm
