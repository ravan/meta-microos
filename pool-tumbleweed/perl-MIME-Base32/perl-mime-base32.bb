SUMMARY = "Base32 encoder and decoder"
DESCRIPTION = "This module is for encoding/decoding data much the way that MIME::Base64 \
does. \
 \
Prior to version 1.0, MIME::Base32 used the 'base32hex' (or '[0-9A-V]') \
encoding and decoding methods by default. If you need to maintain that \
behavior, please call 'encode_base32hex' or 'decode_base32hex' functions \
directly. \
 \
Now, in accordance with at https://tools.ietf.org/html/rfc3548#section-5, \
MIME::Base32 uses the 'encode_base32' and 'decode_base32' functions by \
default."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.303.0"

RPM_NAME = "perl-MIME-Base32-1.303.0-1.10.noarch.rpm"
RPM_HASH = "48f22a293953d6ded1cc874dd84deceb73b5727c20967c060e35b98ac2882423c8c43eca9b284e2d4045045d512a2311b11a3c97552b480a834565539d1ffceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Base32 \
perl-MIME-Base32"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
