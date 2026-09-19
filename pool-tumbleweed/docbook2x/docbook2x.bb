SUMMARY = "DocBook-to-Texinfo Converter"
DESCRIPTION = "A new tool based on Perl modules."
LICENSE = "MIT"

PV = "0.8.8"

RPM_NAME = "docbook2x-0.8.8-130.7.aarch64.rpm"
RPM_HASH = "dd1fd559ed10e294a2af9bf8eb838299e79448e58dd1eb3af1b12e72bd4e4b02ba711496e86865fe884d5b3378227b9167a238b9aba0d23c576019047d65d470"

RPROVIDES:${PN} += "config-docbook2x \
db2x \
docbook2X \
docbook2x"

RDEPENDS:${PN} += "/usr/bin/edit-xml-catalog \
/usr/bin/perl \
/usr/bin/sgml-register-catalog \
/usr/bin/sh \
/usr/bin/xmlcatalog \
awk \
docbook-4 \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
openjade \
opensp \
perl-URI \
perl-XML-DOM \
perl-XML-Parser \
perl-XML-RegExp \
perl-XML-SAX \
perl-libwww-perl \
sed \
sgml-skel \
tidy"

inherit rpm
