SUMMARY = "JSON Web Token the Mojo way"
DESCRIPTION = "JSON Web Token is described in https://tools.ietf.org/html/rfc7519. \
Mojo::JWT implements that standard with an API that should feel familiar to \
Mojolicious users (though of course it is useful elsewhere). Indeed, JWT is \
much like Mojolicious::Sessions except that the result is a url-safe text \
string rather than a cookie. \
 \
In JWT, the primary payload is called the 'claims', and a few claims are \
reserved, as seen in the IETF document. The header and the claims are \
signed when stringified to guard against tampering. Note that while signed, \
the data is not encrypted, so don't use it to send secrets over clear \
channels."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20.0"

RPM_NAME = "perl-Mojo-JWT-1.20.0-2.1.noarch.rpm"
RPM_HASH = "d10192bc613090b1e455798b7e459bd4035e3d20543542ffec8bd590838f436c8f22360a5d1ec82585468dc06bce8db8b2067f01afe6f93039166dbc22ef583c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--JWT \
perl-Mojo-JWT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CryptX \
perl-Mojolicious"

inherit rpm
