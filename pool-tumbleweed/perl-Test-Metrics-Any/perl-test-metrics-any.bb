SUMMARY = "Assert that code produces metrics via L<Metrics::Any>"
DESCRIPTION = "This test module helps write unit tests which assert that the code under \
test reports metrics via Metrics::Any. \
 \
Loading this module automatically sets the Metrics::Any::Adapter type to \
'Test'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Test-Metrics-Any-0.01-1.28.noarch.rpm"
RPM_HASH = "947d037ecbd4a573aa393f01736249d2e1bae77c1f13800468e1182a85c3dd885e5a0aa2c76624ffa87ab4072717ee8afa973c7f6f2b5cb736106df434f1df6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Metrics--Any \
perl-Test--Metrics--Any---predicate \
perl-Test-Metrics-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Metrics--Any--Adapter \
perl-Metrics--Any--Adapter--Test"

inherit rpm
