SUMMARY = "RFC 2822 Address Parsing and Creation"
DESCRIPTION = "This class implements a regex-based RFC 2822 parser that locates email \
addresses in strings and returns a list of 'Email::Address' objects found. \
Alternatively you may construct objects manually. The goal of this software \
is to be correct, and very very fast. \
 \
Version 1.909 and earlier of this module had vulnerabilies (at \
https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2015-7686) and (at \
https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2018-12558) which \
allowed specially constructed email to cause a denial of service. The \
reported vulnerabilities and some other pathalogical cases (meaning they \
really shouldn't occur in normal email) have been addressed in version \
1.910 and newer. If you're running version 1.909 or older, you should \
update! \
 \
Alternatively, you could switch to *Email::Address::XS* which has a \
backward compatible API. *Why not just use that?*"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.913"

RPM_NAME = "perl-Email-Address-1.913-1.17.noarch.rpm"
RPM_HASH = "a3894a2ef3550ed0a1cb0f98cd75f305e65fba61cb234814f258b47f9f211702694cdcab58baac69e6ae6b726314a6a4cec06830fe32d2a08ab439cb335987f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Address \
perl-Email-Address"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
