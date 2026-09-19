SUMMARY = "XML parsing class based on PHP's bundled expat"
DESCRIPTION = "This is an XML parser based on PHPs built-in xml extension. \
 \
It supports two basic modes of operation: 'func' and 'event'. In 'func' mode, \
it will look for a function named after each element (xmltag_ELEMENT for start \
tags and xmltag_ELEMENT_ for end tags), and in 'event' mode it uses a set of \
generic callbacks. \
 \
Since version 1.2.0 there's a new XML_Parser_Simple class that makes parsing of \
most XML documents easier, by automatically providing a stack for the elements. \
Furthermore its now possible to split the parser from the handler object, so \
you do not have to extend XML_Parser anymore in order to parse a document with \
it."
LICENSE = "BSD-2-Clause"

PV = "1.3.8"

RPM_NAME = "php-pear-XML_Parser-1.3.8-1.19.noarch.rpm"
RPM_HASH = "c9026136373660de980e0b94cb6343e2950998a595c7b6ea4f66b19754adac95f316bdad16e049a812d0d36d5e7aa58f83577479e5f90674a28c4fbd9a738474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-XML-Parser \
php5-pear-XML-Parser \
php7-pear-XML-Parser"

RDEPENDS:${PN} += "/usr/bin/sh \
php-pear"

inherit rpm
