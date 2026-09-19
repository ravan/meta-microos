SUMMARY = "Unit testing framework with a focus on being easy to use"
DESCRIPTION = "busted is a unit testing framework with a focus on being easy to \
use. busted works with lua >= 5.1, moonscript, terra, and LuaJIT \
>= 2.0.0. \
 \
busted test specs read naturally without being too verbose. You \
can even chain asserts and negations, such as assert.not.equals. \
Nest blocks of tests with contextual descriptions using describe, \
and add tags to blocks so you can run arbitrary groups of tests. \
 \
An extensible assert library allows you to extend and craft your \
own assert functions specific to your case with method chaining. \
A modular output library lets you add on your own output format, \
along with the default pretty and plain terminal output, JSON \
with and without streaming, and TAP-compatible output that allows \
you to run busted specs within most CI servers. You can even \
register phrases for internationaliation with custom or built-in \
language packs."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "lua53-busted-2.3.0-1.2.noarch.rpm"
RPM_HASH = "f9c1867bbf1582678b05c3bac5d3a9a0d089adcf05a570265a38a914245348f7b4f902cb015dc6f23b29369419be395d04cb752ded7a53706527760bce087239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-busted"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
lua53 \
lua53-cliargs \
lua53-dkjson \
lua53-lua-ev \
lua53-luafilesystem \
lua53-luassert \
lua53-luasystem \
lua53-luaterm \
lua53-mediator-lua \
lua53-penlight \
lua53-say \
openssl \
unzip \
update-alternatives"

inherit rpm
