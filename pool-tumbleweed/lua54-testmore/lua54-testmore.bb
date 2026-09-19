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

RPM_NAME = "lua54-testmore-0.3.7-3.2.noarch.rpm"
RPM_HASH = "c9080a3d9246f51c64c957371a47a0e71855e0c57715ae80897d24abe0c434ab1ed281f3717f40d0823252b3a00eca951790855ce4363bd7ddc1795c7d2a5fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-testmore \
lua54-testmore"

RDEPENDS:${PN} += "lua54"

inherit rpm
