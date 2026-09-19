SUMMARY = "Use libraries from a t/lib directory"
DESCRIPTION = "Searches upward from the calling module for a directory _t_ with a _lib_ \
directory inside it, and adds it to the module search path. Looks upward up \
to 5 directories. This is intended to be used in test modules either \
directly in _t_ or in a subdirectory to find their included testing \
libraries located in _t/lib_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003"

RPM_NAME = "perl-Test-Lib-0.003-1.20.noarch.rpm"
RPM_HASH = "2e3b708470f4dc59e0dc7e1483f0d051a83538b3a0060e9b74eab0bba274a78c3df496139d1204ed33e97e9fd848eec2e59210253b83170107a2a617c945472d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Lib \
perl-Test-Lib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
