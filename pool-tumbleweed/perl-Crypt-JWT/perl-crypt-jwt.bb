SUMMARY = "JSON Web Token"
DESCRIPTION = "Implements *JSON Web Token (JWT)* - https://tools.ietf.org/html/rfc7519. \
The implementation covers not only *JSON Web Signature (JWS)* - \
https://tools.ietf.org/html/rfc7515, but also *JSON Web Encryption (JWE)* - \
https://tools.ietf.org/html/rfc7516. \
 \
The module implements all algorithms defined in \
https://tools.ietf.org/html/rfc7518 - *JSON Web Algorithms (JWA)*. \
 \
This module supports *Compact JWS/JWE* and *Flattened JWS/JWE JSON* \
serialization. General (multi-recipient) JSON serialization is not \
supported."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.38.0"

RPM_NAME = "perl-Crypt-JWT-0.38.0-1.3.noarch.rpm"
RPM_HASH = "6ecfb059ac9cbe340d7de68ff3e4b6111c748ef25f4165f62e6b6be7f2a1b13c20a15b06a2a289fbf67231b907cf18ad777a311e199c5f8c8b1fd0b2d848f967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--JWT \
perl-Crypt--KeyWrap \
perl-Crypt-JWT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Raw--Zlib \
perl-CryptX \
perl-JSON \
perl-Test--More"

inherit rpm
