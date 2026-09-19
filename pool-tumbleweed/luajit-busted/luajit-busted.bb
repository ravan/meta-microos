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

RPM_NAME = "luajit-busted-2.3.0-1.2.noarch.rpm"
RPM_HASH = "817d2e06f28494a799ad45084d560a7a95236ebba7de7c1bb27a2ab3b9f8ea5d15fa3d0e963d141121f6758bccc5f054547c1f6038a5e9f7e7920a29ed59938f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-busted"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
luajit \
luajit-cliargs \
luajit-dkjson \
luajit-lua-ev \
luajit-luafilesystem \
luajit-luassert \
luajit-luasystem \
luajit-luaterm \
luajit-mediator-lua \
luajit-penlight \
luajit-say \
openssl \
unzip \
update-alternatives"

inherit rpm
