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

RPM_NAME = "lua54-busted-2.3.0-1.2.noarch.rpm"
RPM_HASH = "3f7676b69013f871e2077f5648f3e917a672a02751cc19aa63171a7a5352909552193856e76f92bc6c87dbbc35b633b49e6e91073486aaece1264159d62c547b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-busted \
lua54-busted"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
lua54 \
lua54-cliargs \
lua54-dkjson \
lua54-lua-ev \
lua54-luafilesystem \
lua54-luassert \
lua54-luasystem \
lua54-luaterm \
lua54-mediator-lua \
lua54-penlight \
lua54-say \
openssl \
unzip \
update-alternatives"

inherit rpm
