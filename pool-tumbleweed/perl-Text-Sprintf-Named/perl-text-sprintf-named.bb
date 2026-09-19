SUMMARY = "Sprintf-like function with named conversions"
DESCRIPTION = "Text::Sprintf::Named provides a sprintf equivalent with named conversions. \
Named conversions are sprintf field specifiers (like ''%s'' or ''%4d'') \
only they are associated with the key of an associative array of \
parameters. So for example ''s'' will emit the ''name'' parameter as \
a string, and ''4d'' will emit the ''num'' parameter as a variable \
with a width of 4."
LICENSE = "MIT"

PV = "0.0405"

RPM_NAME = "perl-Text-Sprintf-Named-0.0405-1.28.noarch.rpm"
RPM_HASH = "87495ca85ddd280064ab484d553404d3c4a495b1e9bb34f1a7148eadcd98747cfa9e4c63a8ec99cf329be56686e91ea2e61335338b4f509fac3c0b71f92e6b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Sprintf--Named \
perl-Text-Sprintf-Named"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
