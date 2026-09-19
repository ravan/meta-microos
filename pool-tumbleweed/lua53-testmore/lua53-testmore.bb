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

RPM_NAME = "lua53-testmore-0.3.7-3.2.noarch.rpm"
RPM_HASH = "73338ce81fd7cc80f7fa7661152fcaa1f97cfedda6ce8ec5d71db418a144cb6afd0ae9e636bcd4c80c5e70cbd5dbd5ba8d5943d023c0b28f6a60a6c5bba88ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-testmore"

RDEPENDS:${PN} += "lua53"

inherit rpm
