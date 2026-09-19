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

RPM_NAME = "lua55-busted-2.3.0-1.2.noarch.rpm"
RPM_HASH = "1f885e387bc6910617b9afeed4f4f7c3d546d43f86bf2e67adbbc8d8b6a539233695d9d238ffb9017a405a6310cdf898a7d73bc0906f3a080bf11c22d5a900e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-busted"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
lua55 \
lua55-cliargs \
lua55-dkjson \
lua55-lua-ev \
lua55-luafilesystem \
lua55-luassert \
lua55-luasystem \
lua55-luaterm \
lua55-mediator-lua \
lua55-penlight \
lua55-say \
openssl \
unzip \
update-alternatives"

inherit rpm
