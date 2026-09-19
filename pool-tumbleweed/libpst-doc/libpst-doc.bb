SUMMARY = "Documentation for the pst utilities in html format"
DESCRIPTION = "The libpst-doc package contains the html documentation for the pst \
utilities.  You do not need to install it if you just want to use \
the libpst utilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-doc-0.6.76-3.6.noarch.rpm"
RPM_HASH = "b61a5fb659c84d5489bef1f75f591ab588cda0dab6efbae43bfb83723c2e377fd224cbf81eccccf67b9e511c29b0dd218ce63e5e3b33258c5167113229fca159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpst-doc"

RDEPENDS:${PN} += ""

inherit rpm
