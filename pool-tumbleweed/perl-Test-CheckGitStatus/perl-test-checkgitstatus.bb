SUMMARY = "Check git status after every test"
DESCRIPTION = "This module can be used to check if your git directory has any modified or \
untracked files. You can use it in your unit tests, and it will check the \
status after each test file. \
 \
By default it will not run the check, as this would be annoying during \
development."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "perl-Test-CheckGitStatus-0.1.2-1.7.noarch.rpm"
RPM_HASH = "011ac04012c82845ae276658694452d118826042e8574f46800048e99e31d9e573e8c65495c0e365dee70903f89aa3e5bea76f0e3eec5a94bd4fda7ce9974fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckGitStatus \
perl-Test-CheckGitStatus"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-Test--More"

inherit rpm
