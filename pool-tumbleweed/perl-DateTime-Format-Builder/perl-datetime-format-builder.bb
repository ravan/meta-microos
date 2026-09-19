SUMMARY = "Create DateTime parser classes and objects"
DESCRIPTION = "DateTime::Format::Builder creates DateTime parsers. Many string formats of \
dates and times are simple and just require a basic regular expression to \
extract the relevant information. Builder provides a simple way to do this \
without writing reams of structural code. \
 \
Builder provides a number of methods, most of which you'll never need, or \
at least rarely need. They're provided more for exposing of the module's \
innards to any subclasses, or for when you need to do something slightly \
beyond what I expected."
LICENSE = "Artistic-2.0"

PV = "0.830.0"

RPM_NAME = "perl-DateTime-Format-Builder-0.830.0-1.3.noarch.rpm"
RPM_HASH = "1d2ad48aede2bff28fe4d9db5cbb2b7e93b3eaa839bc3b665b45d474c240401e9fc994e02a0b8dc6232dcdc03c8d40712eb1b314b1ef9544f84afa5f3fc35676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Builder \
perl-DateTime--Format--Builder--Parser \
perl-DateTime--Format--Builder--Parser--Dispatch \
perl-DateTime--Format--Builder--Parser--Quick \
perl-DateTime--Format--Builder--Parser--Regex \
perl-DateTime--Format--Builder--Parser--Strptime \
perl-DateTime--Format--Builder--Parser--generic \
perl-DateTime-Format-Builder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Format--Strptime \
perl-Params--Validate \
perl-parent"

inherit rpm
