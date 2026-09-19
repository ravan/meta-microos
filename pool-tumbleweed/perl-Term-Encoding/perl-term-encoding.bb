SUMMARY = "Detect encoding of the current terminal"
DESCRIPTION = "Term::Encoding is a simple module to detect an encoding the current \
terminal expects, in various ways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Term-Encoding-0.03-1.31.noarch.rpm"
RPM_HASH = "4e7a7931aebf8e36f0d418b0c6a65226da5eba8b81faa632ac12164a65a905478a14cc38365a810bf4650f9b1110f74a96b329704cc8f0f2386659b4b78fde0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Encoding \
perl-Term-Encoding"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
