SUMMARY = "Provides an interface for RFC 2253 style DN strings"
DESCRIPTION = "X500::DN Provides a pure perl parser and formatter for RFC 2253 style \
DN strings. \
 \
 \
 \
Authors: \
-------- \
    Robert Joop <yaph-020416@timesink.de>"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.29"

RPM_NAME = "perl-X500-DN-0.29-110.12.aarch64.rpm"
RPM_HASH = "f0eb6820c186f25bed19d76a4cf8c043cfebf371391933a0618868fc0d286d5d1ce944d9e09f80164b2921fce0a91a4c3b273d6a5435aed916dcc1316e96f299"

RPROVIDES:${PN} += "perl-X500--DN \
perl-X500--RDN \
perl-X500-DN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Parse-RecDescent"

inherit rpm
