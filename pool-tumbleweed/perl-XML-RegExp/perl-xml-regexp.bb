SUMMARY = "Regular expressions for XML tokens"
DESCRIPTION = "This package contains regular expressions for the following XML tokens: \
BaseChar, Ideographic, Letter, Digit, Extender, CombiningChar, NameChar, \
EntityRef, CharRef, Reference, Name, NmToken, and AttValue. \
 \
The definitions of these tokens were taken from the XML spec (Extensible \
Markup Language 1.0) at the http://www.w3.org/TR/REC-xml manpage. \
 \
Also contains the regular expressions for the following tokens from the XML \
Namespaces spec at the http://www.w3.org/TR/REC-xml-names manpage: \
NCNameChar, NCName, QName, Prefix and LocalPart."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-XML-RegExp-0.04-9.42.noarch.rpm"
RPM_HASH = "bd609df9e0ad6edc5ea798ad2ee16265db9bc2dadd8031fc82f4c0f06ea14b6d49be9cb89cbfc4e77ff49bf879f03a302319216c4facf9a7467099cbaced4ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--RegExp \
perl-XML-RegExp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
