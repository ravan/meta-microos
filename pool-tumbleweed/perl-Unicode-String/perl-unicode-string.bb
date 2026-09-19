SUMMARY = "String of Unicode characters (UTF-16BE)"
DESCRIPTION = "A 'Unicode::String' object represents a sequence of Unicode characters. \
Methods are provided to convert between various external formats \
(encodings) and 'Unicode::String' objects, and methods are provided for \
common string manipulations. \
 \
The functions utf32be(), utf32le(), utf16be(), utf16le(), utf8(), utf7(), \
latin1(), uhex(), uchr() can be imported from the 'Unicode::String' module \
and will work as constructors initializing strings of the corresponding \
encoding. \
 \
The 'Unicode::String' objects overload various operators, which means that \
they in most cases can be treated like plain strings. \
 \
Internally a 'Unicode::String' object is represented by a string of 2 byte \
numbers in network byte order (big-endian). This representation is not \
visible by the API provided, but it might be useful to know in order to \
predict the efficiency of the provided methods."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2.10"

RPM_NAME = "perl-Unicode-String-2.10-1.51.aarch64.rpm"
RPM_HASH = "a39cf9507de7214dde15fddff43e98255b9d4d35c9dd82653dbf1af7986a42763719bc7296a03de6765aa3a837473e361b15b466f0f3437e0404a7319ae8a34f"

RPROVIDES:${PN} += "perl-Unicode--CharName \
perl-Unicode--String \
perl-Unicode-String"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
