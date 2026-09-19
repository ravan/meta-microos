SUMMARY = "Perl extension for emulating troublesome interfaces"
DESCRIPTION = "It's a simple program that doesn't use any other modules, and those are \
easy to test. More often, testing a program completely means faking up \
input to another module, trying to coax the right output from something \
you're not supposed to be testing anyway. \
 \
Testing is a lot easier when you can control the entire environment. With \
Test::MockObject, you can get a lot closer. \
 \
Test::MockObject allows you to create objects that conform to particular \
interfaces with very little code. You don't have to reimplement the \
behavior, just the input and the output."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20200122"

RPM_NAME = "perl-Test-MockObject-1.20200122-1.29.noarch.rpm"
RPM_HASH = "aa3c3f79a47c55b121eb5ce6681d55a5ec2a4e624188ce63bdf60c55f1cbc793525d90f39af10ff592e6d09a5daa0794c901b1cfab669d69bbc5dade4335cd54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockObject \
perl-Test--MockObject--Extends \
perl-Test-MockObject"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-UNIVERSAL--can \
perl-UNIVERSAL--isa"

inherit rpm
