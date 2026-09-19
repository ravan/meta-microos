SUMMARY = "Compare JSON with Test::Deep"
DESCRIPTION = "Test::Deep::JSON provides the 'json($expected)' function to expect that \
target can be parsed as a JSON string and matches (by 'cmp_deeply') with \
_$expected_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.50.0"

RPM_NAME = "perl-Test-Deep-JSON-0.50.0-1.7.noarch.rpm"
RPM_HASH = "28b0d8d2553d03e44f127d46d2078705f845761fe938f26db8655a59767444ab3f600da718975e2e6b1dfa3c919d909b3639a90909325ae2979015dcc2148d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Deep--JSON \
perl-Test-Deep-JSON"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter--Lite \
perl-JSON--MaybeXS \
perl-Test--Deep"

inherit rpm
