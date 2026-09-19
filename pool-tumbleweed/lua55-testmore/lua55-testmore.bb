SUMMARY = "A Lua port of the Perl Test::More unit testing framework"
DESCRIPTION = "lua-TestMore is a port of the Perl5 module Test::More. It uses the \
Test Anything Protocol as output, that allows a compatibility with \
the Perl QA ecosystem. It's an extensible framework. \
See lua-TestAssertion an extension which provides many Lua friendly \
assertions. It allows a simple and efficient way to write tests \
(without OO style). Some tests could be marked as TODO or skipped. \
Errors could be fully checked with error_like()."
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "lua55-testmore-0.3.7-3.2.noarch.rpm"
RPM_HASH = "536132e694d4f94ea728a3fa11e9254d569cd173c04616a5abebbe8a6bb8ce2bbce411c4e49d79edf958c28cbecb10471f0f8e0a10ab9e1e609682b2539d4bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-testmore"

RDEPENDS:${PN} += "lua55"

inherit rpm
