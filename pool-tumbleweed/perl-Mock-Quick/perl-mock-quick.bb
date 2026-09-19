SUMMARY = "Quickly mock objects and classes, even temporarily replace them,"
DESCRIPTION = "Mock-Quick is here to solve the current problems with Mocking libraries. \
 \
There are a couple Mocking libraries available on CPAN. The primary \
problems with these libraries include verbose syntax, and most importantly \
side-effects. Some Mocking libraries expect you to mock a specific class, \
and will unload it then redefine it. This is particularly a problem if you \
only want to override a class on a lexical level. \
 \
Mock-Quick provides a declarative mocking interface that results in a very \
concise, but clear syntax. There are separate facilities for mocking object \
instances, and classes. You can quickly create an instance of an object \
with custom attributes and methods. You can also quickly create an \
anonymous class, optionally inheriting from another, with whatever methods \
you desire. \
 \
Mock-Quick also provides a tool that provides an OO interface to overriding \
methods in existing classes. This tool also allows for the restoration of \
the original class methods. Best of all this is a localized tool, when your \
control object falls out of scope the original class is restored."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.111"

RPM_NAME = "perl-Mock-Quick-1.111-1.38.noarch.rpm"
RPM_HASH = "f1dc4e772d2c01a59d7a558d4f2dc8b475d680ba8978531d1d94613f4a3f62df65215a634ed2a54bda271d3825c8fd10bc7a11f2ec63cd94aeaf7bdc32045aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mock--Quick \
perl-Mock--Quick--Class \
perl-Mock--Quick--Method \
perl-Mock--Quick--Object \
perl-Mock--Quick--Object--Control \
perl-Mock--Quick--Util \
perl-Mock-Quick \
perl-Object--Quick"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter--Declare"

inherit rpm
