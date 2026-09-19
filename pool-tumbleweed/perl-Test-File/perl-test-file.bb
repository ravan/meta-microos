SUMMARY = "Test file attributes"
DESCRIPTION = "This modules provides a collection of test utilities for file attributes. \
 \
Some file attributes depend on the owner of the process testing the file in \
the same way the file test operators do. For instance, root (or super-user \
or Administrator) may always be able to read files no matter the \
permissions. \
 \
Some attributes don't make sense outside of Unix, either, so some tests \
automatically skip if they think they won't work on the platform. If you \
have a way to make these functions work on Windows, for instance, please \
send me a patch. :) If you want to pretend to be Windows on a non-Windows \
machine (for instance, to test 'skip()'), you can set the \
'PRETEND_TO_BE_WINDOWS' environment variable. \
 \
The optional NAME parameter for every function allows you to specify a name \
for the test. If not supplied, a reasonable default will be generated."
LICENSE = "Artistic-2.0"

PV = "1.995.0"

RPM_NAME = "perl-Test-File-1.995.0-1.7.aarch64.rpm"
RPM_HASH = "20fc94acf4856caf3b1adc2500b366cf3f4566c0777fd277f6e3c4e3d93a0da63e2ba0fd73828de9805133efb190f7b330177cb84a6ea7a614098d858a7da23f"

RPROVIDES:${PN} += "perl-Test--File \
perl-Test-File"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
