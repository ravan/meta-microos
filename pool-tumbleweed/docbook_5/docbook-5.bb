SUMMARY = "DocBook Schemas (DTD, RELAX NG, W3C Schema) for Version 5.x"
DESCRIPTION = "DocBook is a schema. It is particularly well-suited to books and papers \
about computer hardware and software (though it is not limited to these \
applications at all). \
 \
Version 5 is a complete rewrite of DocBook in RELAX NG. \
The intent of this rewrite is to produce a schema that is true to the \
spirit of DocBook while simultaneously removing inconsistencies that \
have arisen as a natural consequence of DocBook's long, slow evolution."
LICENSE = "SUSE-Oasis-Specification-Notice"

PV = "5.2cr5"

RPM_NAME = "docbook_5-5.2cr5-3.7.noarch.rpm"
RPM_HASH = "839468dd40abc4ce340571354cc99aab6a09e1fc37b010061f6410525106d7e85a84f591c981ffcb2ff09de80127b23f564ed5b93a598f181de797e502c799aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-5 \
docbook-5"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
sgml-skel"

inherit rpm
