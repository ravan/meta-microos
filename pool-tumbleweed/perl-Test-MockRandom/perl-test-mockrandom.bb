SUMMARY = "Replaces random number generation with non-random number generation"
DESCRIPTION = "This perhaps ridiculous-seeming module was created to test routines that \
manipulate random numbers by providing a known output from 'rand'. Given a \
list of seeds with 'srand', it will return each in turn. After seeded \
random numbers are exhausted, it will always return 0. Seed numbers must be \
of a form that meets the expected output from 'rand' as called with no \
arguments -- i.e. they must be between 0 (inclusive) and 1 (exclusive). In \
order to facilitate generating and testing a nearly-one number, this module \
exports the function 'oneish', which returns a number just fractionally \
less than one. \
 \
Depending on how this module is called with 'use', it will export 'rand' to \
a specified package (e.g. a class being tested) effectively overriding and \
intercepting calls in that package to the built-in 'rand'. It can also \
override 'rand' in the current package or even globally. In all of these \
cases, it also exports 'srand' and 'oneish' to the current package in order \
to control the output of 'rand'. See USAGE for details. \
 \
Alternatively, this module can be used to generate objects, with each \
object maintaining its own distinct seed array."
LICENSE = "Apache-2.0"

PV = "1.01"

RPM_NAME = "perl-Test-MockRandom-1.01-1.38.noarch.rpm"
RPM_HASH = "222acebc4188dbcd887596dba86336a577a87414075edbbff060f17beb677f29a647303bc63235d69d5f118bf4f1a6932ef5f9edccb4d285f46c5f0a4e59e040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockRandom \
perl-Test-MockRandom"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
