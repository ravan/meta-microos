SUMMARY = "Incredibly simple helpers for testing code with exceptions"
DESCRIPTION = "Test::Fatal is an alternative to the popular Test::Exception. It does much \
less, but should allow greater flexibility in testing exception-throwing \
code with about the same amount of typing. \
 \
It exports one routine by default: 'exception'. \
 \
*Achtung!* 'exception' intentionally does not manipulate the call stack. \
User-written test functions that use 'exception' must be careful to avoid \
false positives if exceptions use stack traces that show arguments. For a \
more magical approach involving globally overriding 'caller', see \
Test::Exception."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18.0"

RPM_NAME = "perl-Test-Fatal-0.18.0-1.5.noarch.rpm"
RPM_HASH = "8eb05a03afbe52dded8f91a3e25b833082b7d9dfc8ec5f951730f98a222eb586792d23ee199b5bc8a845fb43644ce5c875d1113b99fe2a881e6c1b4962a8b1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Fatal \
perl-Test-Fatal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Try--Tiny"

inherit rpm
