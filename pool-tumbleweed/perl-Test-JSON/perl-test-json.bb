SUMMARY = "Test JSON data"
DESCRIPTION = "JavaScript Object Notation (JSON) is a lightweight data interchange format. \
the Test::JSON manpage makes it easy to verify that you have built valid \
JSON and that it matches your expected output. \
 \
See the http://www.json.org/ manpage for more information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Test-JSON-0.11-1.40.noarch.rpm"
RPM_HASH = "e4fc57111cf469d64a986345750cfcefbb11d510f6e8bb01ee712598750d073e54adf8565a4ef24236147bfc21cbe7f8a0db9f2cc9caec8babc6b591c9be5a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--JSON \
perl-Test-JSON"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-JSON--Any \
perl-Test--Differences \
perl-Test--Tester"

inherit rpm
