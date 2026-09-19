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

RPM_NAME = "luajit-testmore-0.3.7-3.2.noarch.rpm"
RPM_HASH = "c846970b4a01605266de97222ed9964d393fa05022d33209d98c65e91e49d5918d0a0e6deec4c3cc94736cee06f7b378f8b6d2430391dc152d41930e144d4834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-testmore"

RDEPENDS:${PN} += "luajit"

inherit rpm
