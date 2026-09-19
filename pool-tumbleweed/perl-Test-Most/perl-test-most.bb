SUMMARY = "Most commonly needed test functions and features"
DESCRIPTION = "Test::Most exists to reduce boilerplate and to make your testing life \
easier. We provide 'one stop shopping' for most commonly used testing \
modules. In fact, we often require the latest versions so that you get bug \
fixes through Test::Most and don't have to keep upgrading these modules \
separately. \
 \
This module provides you with the most commonly used testing functions, \
along with automatically turning on strict and warning and gives you a bit \
more fine-grained control over your test suite. \
 \
    use Test::Most tests => 4, 'die'; \
 \
    ok 1, 'Normal calls to ok() should succeed'; \
    is 2, 2, '... as should all passing tests'; \
    eq_or_diff [3], [4], '... but failing tests should die'; \
    ok 4, '... will never get to here'; \
 \
As you can see, the 'eq_or_diff' test will fail. Because 'die' is in the \
import list, the test program will halt at that point. \
 \
If you do not want strict and warnings enabled, you must explicitly disable \
them. Thus, you must be explicit about what you want and no longer need to \
worry about accidentally forgetting them. \
 \
    use Test::Most tests => 4; \
    no strict; \
    no warnings;"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.420.0"

RPM_NAME = "perl-Test-Most-0.420.0-1.3.noarch.rpm"
RPM_HASH = "2cec4c4c4e2fda8587dc0abbcb839c1f5ac521ef7c4770f314c11a7694fbd682cd5e910340622dd18205a6ab98848bf6d3991651df9f9930aebe0698e64f8f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Most \
perl-Test--Most--Exception \
perl-Test-Most"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exception--Class \
perl-Test--Deep \
perl-Test--Differences \
perl-Test--Exception \
perl-Test--Harness \
perl-Test--More \
perl-Test--Warn"

inherit rpm
