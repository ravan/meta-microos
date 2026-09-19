SUMMARY = "DocBook DTD Version 4.x"
DESCRIPTION = "DocBook is a schema. It is particularly well-suited to books and papers \
about computer hardware and software (though it is not limited to these \
applications at all). This package has SGML- and XML-DTD versions \
included. Some versions of DocBook contain also a RELAX NG and W3C \
Schema."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.5"

RPM_NAME = "docbook_4-4.5-145.2.noarch.rpm"
RPM_HASH = "800455c4f6f5b022587f88ed445733a5aad7bf09a34ec211c39a1e3f887a4e2e4124a80306b02547f06a8a8f1c9dc060b427b0644527bbd3a361e16d321ad917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-4 \
docbook \
docbook-4 \
docbook-dtd \
docbook-dtds"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/xmlcatalog \
awk \
grep \
iso-ent \
sed \
sgml-skel"

inherit rpm
