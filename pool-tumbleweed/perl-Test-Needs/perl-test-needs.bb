SUMMARY = "Skip tests when modules not available"
DESCRIPTION = "Skip test scripts if modules are not available. The requested modules will \
be loaded, and optionally have their versions checked. If the module is \
missing, the test script will be skipped. Modules that are found but fail \
to compile will exit with an error rather than skip. \
 \
If used in a subtest, the remainder of the subtest will be skipped. \
 \
Skipping will work even if some tests have already been run, or if a plan \
has been declared. \
 \
Versions are checked via a '$module->VERSION($wanted_version)' call. \
Versions must be provided in a format that will be accepted. No extra \
processing is done on them. \
 \
If 'perl' is used as a module, the version is checked against the running \
perl version ($]). The version can be specified as a number, dotted-decimal \
string, v-string, or version object. \
 \
If the 'RELEASE_TESTING' environment variable is set, the tests will fail \
rather than skip. Subtests will be aborted, but the test script will \
continue running after that point."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.002010"

RPM_NAME = "perl-Test-Needs-0.002010-1.17.noarch.rpm"
RPM_HASH = "a900fe082248d2357dac062c7907092e1181474b0738b35c0b8be95b0d5587c2414518b7270b5d5e57afbccd0cb501c1634fc5f824d932065f37209624d15f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Needs \
perl-Test-Needs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
