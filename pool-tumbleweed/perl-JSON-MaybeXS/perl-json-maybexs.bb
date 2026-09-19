SUMMARY = "Use Cpanel::JSON::XS with a fallback to JSON::XS and JSON::PP"
DESCRIPTION = "This module first checks to see if either Cpanel::JSON::XS or JSON::XS (at \
at least version 3.0) is already loaded, in which case it uses that module. \
Otherwise it tries to load Cpanel::JSON::XS, then JSON::XS, then JSON::PP \
in order, and either uses the first module it finds or throws an error. \
 \
It then exports the 'encode_json' and 'decode_json' functions from the \
loaded module, along with a 'JSON' constant that returns the class name for \
calling 'new' on. \
 \
If you're writing fresh code rather than replacing JSON.pm usage, you might \
want to pass options as constructor args rather than calling mutators, so \
we provide our own 'new' method that supports that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.004008"

RPM_NAME = "perl-JSON-MaybeXS-1.004008-1.10.noarch.rpm"
RPM_HASH = "66d1b06d8ae59bcc2f66b7a147c556ac4de821c1ceab7b6f650d4e3d03e849ce635e4db922f51a4af49ea43b06c4684e17872d74249a7943f3207ade54decfaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--MaybeXS \
perl-JSON-MaybeXS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-JSON--PP"

inherit rpm
