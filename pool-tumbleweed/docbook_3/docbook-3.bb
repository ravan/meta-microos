SUMMARY = "DocBook DTD 3.x"
DESCRIPTION = "This package contains version 3.0 and 3.1 and an XML version.  It is \
suitable for writing technical documentation. \
 \
The documentation can be found in /usr/share/doc/packages/docbook_3."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.1"

RPM_NAME = "docbook_3-3.1-773.9.noarch.rpm"
RPM_HASH = "a12b38d72b94df28848de223ad58b0f4310888f459724289091f903adc670038425b67d50132ae9be998070b8c196b477dbc645625c866b58253baff423d3346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-3"

RDEPENDS:${PN} += "/usr/bin/sgml-register-catalog \
/usr/bin/sh \
/usr/bin/xmlcatalog \
docbook-4 \
iso-ent"

inherit rpm
